package MachineCoding;

import java.util.*;

enum VehicleType {
    CAR, BIKE, TRUCK
}

class Vehicle {
    VehicleType type;
    String regNo;
    String color;

    public Vehicle(VehicleType type, String regNo, String color) {
        this.type = type;
        this.regNo = regNo;
        this.color = color;
    }
}

class ParkingSlot {
    int slotNo;
    VehicleType type;
    boolean isOccupied;
    Vehicle parkedVehicle;

    public ParkingSlot(int slotNo, VehicleType type) {
        this.slotNo = slotNo;
        this.type = type;
        this.isOccupied = false;
    }
}

class ParkingFloor {
    int floorNo;
    List<ParkingSlot> slots;

    public ParkingFloor(int floorNo, int numSlots) {
        this.floorNo = floorNo;
        slots = new ArrayList<>();

        // 1st slot - Truck
        if (numSlots >= 1)
            slots.add(new ParkingSlot(1, VehicleType.TRUCK));

        // next 2 - Bikes
        for (int i = 2; i <= Math.min(numSlots, 3); i++) {
            slots.add(new ParkingSlot(i, VehicleType.BIKE));
        }

        // rest - Cars
        for (int i = 4; i <= numSlots; i++) {
            slots.add(new ParkingSlot(i, VehicleType.CAR));
        }
    }
}

class Ticket {
    String ticketId;
    Vehicle vehicle;
    int floorNo;
    int slotNo;

    public Ticket(String ticketId, Vehicle vehicle, int floorNo, int slotNo) {
        this.ticketId = ticketId;
        this.vehicle = vehicle;
        this.floorNo = floorNo;
        this.slotNo = slotNo;
    }
}

class ParkingLot {
    String lotId;
    int numFloors;
    int slotsPerFloor;
    List<ParkingFloor> floors;

    public ParkingLot(String lotId, int numFloors, int slotsPerFloor) {
        this.lotId = lotId;
        this.numFloors = numFloors;
        this.slotsPerFloor = slotsPerFloor;
        floors = new ArrayList<>();
        for (int i = 1; i <= numFloors; i++) {
            floors.add(new ParkingFloor(i, slotsPerFloor));
        }
    }
}

class ParkingLotService {
    ParkingLot parkingLot;
    Map<String, Ticket> activeTickets = new HashMap<>();

    public void createParkingLot(String id, int floors, int slotsPerFloor) {
        parkingLot = new ParkingLot(id, floors, slotsPerFloor);
        System.out.println("Created parking lot with " + floors + " floors and " + slotsPerFloor + " slots per floor");
    }

    public void parkVehicle(VehicleType type, String regNo, String color) {
        if (parkingLot == null) {
            System.out.println("Parking lot not created yet!");
            return;
        }

        for (ParkingFloor floor : parkingLot.floors) {
            for (ParkingSlot slot : floor.slots) {
                if (!slot.isOccupied && slot.type == type) {
                    Vehicle vehicle = new Vehicle(type, regNo, color);
                    slot.isOccupied = true;
                    slot.parkedVehicle = vehicle;
                    String ticketId = parkingLot.lotId + "_" + floor.floorNo + "_" + slot.slotNo;
                    Ticket ticket = new Ticket(ticketId, vehicle, floor.floorNo, slot.slotNo);
                    activeTickets.put(ticketId, ticket);
                    System.out.println("Parked vehicle. Ticket ID: " + ticketId);
                    return;
                }
            }
        }
        System.out.println("Parking Lot Full");
    }

    public void unparkVehicle(String ticketId) {
        if (!activeTickets.containsKey(ticketId)) {
            System.out.println("Invalid Ticket");
            return;
        }

        Ticket ticket = activeTickets.get(ticketId);
        ParkingFloor floor = parkingLot.floors.get(ticket.floorNo - 1);
        ParkingSlot slot = floor.slots.get(ticket.slotNo - 1);

        if (!slot.isOccupied) {
            System.out.println("Invalid Ticket");
            return;
        }

        slot.isOccupied = false;
        Vehicle v = slot.parkedVehicle;
        slot.parkedVehicle = null;
        activeTickets.remove(ticketId);
        System.out.println("Unparked vehicle with Registration Number: " + v.regNo + " and Color: " + v.color);
    }

    public void display(String type, VehicleType vehicleType) {
        switch (type) {
            case "free_count":
                for (ParkingFloor floor : parkingLot.floors) {
                    long count = floor.slots.stream()
                            .filter(s -> s.type == vehicleType && !s.isOccupied)
                            .count();
                    System.out.println("No. of free slots for " + vehicleType + " on Floor " + floor.floorNo + ": " + count);
                }
                break;

            case "free_slots":
                for (ParkingFloor floor : parkingLot.floors) {
                    List<Integer> freeSlots = new ArrayList<>();
                    for (ParkingSlot s : floor.slots) {
                        if (s.type == vehicleType && !s.isOccupied)
                            freeSlots.add(s.slotNo);
                    }
                    System.out.println("Free slots for " + vehicleType + " on Floor " + floor.floorNo + ": " +
                            String.join(",", freeSlots.stream().map(String::valueOf).toArray(String[]::new)));
                }
                break;

            case "occupied_slots":
                for (ParkingFloor floor : parkingLot.floors) {
                    List<Integer> occSlots = new ArrayList<>();
                    for (ParkingSlot s : floor.slots) {
                        if (s.type == vehicleType && s.isOccupied)
                            occSlots.add(s.slotNo);
                    }
                    System.out.println("Occupied slots for " + vehicleType + " on Floor " + floor.floorNo + ": " +
                            String.join(",", occSlots.stream().map(String::valueOf).toArray(String[]::new)));
                }
                break;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ParkingLotService service = new ParkingLotService();

        while (true) {
            String input = sc.nextLine();
            if (input.equals("exit"))
                break;

            String[] parts = input.split(" ");
            String command = parts[0];

            switch (command) {
                case "create_parking_lot":
                    service.createParkingLot(parts[1], Integer.parseInt(parts[2]), Integer.parseInt(parts[3]));
                    break;

                case "park_vehicle":
                    service.parkVehicle(VehicleType.valueOf(parts[1]), parts[2], parts[3]);
                    break;

                case "unpark_vehicle":
                    service.unparkVehicle(parts[1]);
                    break;

                case "display":
                    service.display(parts[1], VehicleType.valueOf(parts[2]));
                    break;
            }
        }
        sc.close();
    }
}
