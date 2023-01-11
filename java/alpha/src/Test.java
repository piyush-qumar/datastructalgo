import java.util.*;

class Manager {
    // declaring private data members
    private int id;
    private int age;
    private String name;
    private String salary;

    // Constructor to initialize private data members
    // Manager(int id, String name, int age, String salary) {
    // // this.id = id;
    // // this.name = name;
    // // this.age = age;
    // // this.salary = salary;
    // }

    // getter and setter methods
    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }
}

class Customer {
    // declaring private data members
    private String name;
    private String gender;
    private String city;
    private String email;
    private long phone;

    // Constructor to initialize private data members
    // public Customer(String name, String gender, String city, String email, long
    // phone) {
    // this.name = name;
    // this.gender = gender;
    // this.city = city;
    // this.email = email;
    // this.phone = phone;
    // }

    // getter and setter methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }
}

class Order {
    // declaring private data members
    private int id;
    private String orderType;

    // Constructor to initialize private data members
    // public Order(int id, String orderType) {
    // this.id = id;
    // this.orderType = orderType;
    // }

    // getter and setter methods
    public int getOrderId() {
        return id;
    }

    public void setOrderId(int id) {
        this.id = id;
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }
}

class Payment {
    private int id;
    private String paymentType;
    private double amount;

    // Constructor to initialize private data members
    // public Payment(int id, String paymentType, double amount) {
    // this.id = id;
    // this.paymentType = paymentType;
    // this.amount = amount;
    // }

    // getter and setter methods
    public int getPaymentId() {
        return id;
    }

    public void setPaymentId(int id) {
        this.id = id;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

class Menu {
    private int id;
    private String menuType;
    private double price;

    // Menu(int id, String menuType, double price) {
    // this.id = id;
    // this.menuType = menuType;
    // this.price = price;
    // }

    public int getMenuId() {
        return id;
    }

    public void setMenuId(int id) {
        this.id = id;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

// Driver class
public class Test {
    public static void main(String[] args) {
        // creating restaurant object with constructor
        Manager r1 = new Manager();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee ID : ");
        int id = sc.nextInt();
        r1.setID(id);
        System.out.print("Enter Employee Name : ");
        String name = sc.next();
        r1.setName(name);
        System.out.print("Enter Employee Age : ");
        int age = sc.nextInt();
        r1.setAge(age);
        System.out.print("Enter Employee Salary : ");
        String salary = sc.next();
        r1.setSalary(salary);

        // r1.Manager(id, name, age, salary);
        System.out.println("\nEmployee ID : " + r1.getID());
        System.out.println("Employee Name : " + r1.getName());
        System.out.println("Employee Age : " + r1.getAge());
        System.out.println("Employee Salary : " + r1.getSalary());
        System.out.println();
        sc.close();
        // creating menuItem object with constructor
        // MenuItem m1 = new MenuItem(1, "McAlooTikki", 200, "Veg");
        // System.out.println("MenuItem Details : ");
        // System.out.println("MenuItem ID : " + m1.getID());
        // System.out.println("MenuItem Name : " + m1.getName());
        // System.out.println("MenuItem Price : " + m1.getPrice());
        // System.out.println("MenuItem Category : " + m1.getCategory());
    }
}