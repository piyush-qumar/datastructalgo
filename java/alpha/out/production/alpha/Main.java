import java.util.*;

public class Main {
    public static List<Platoon> parseInput(String line) {
        List<Platoon> list = new ArrayList<>();
        String[] parts = line.split(";");
        for (String part : parts) {
            String[] tokens = part.split("#");
            list.add(new Platoon(tokens[0], Integer.parseInt(tokens[1])));
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your platoons (e.g., Spearmen#10;Militia#30;FootArcher#20;...):");
        String ownLine = scanner.nextLine();

        System.out.println("Enter opponent's platoons:");
        String oppLine = scanner.nextLine();

        Army ownArmy = new Army(parseInput(ownLine));
        Army opponentArmy = new Army(parseInput(oppLine));

        List<Platoon> winningArrangement = ownArmy.findWinningArrangementAgainst(opponentArmy);

        if (winningArrangement != null) {
            System.out.println("\nSuggested arrangement:");
            for (int i = 0; i < winningArrangement.size(); i++) {
                System.out.print(winningArrangement.get(i));
                if (i != winningArrangement.size() - 1) System.out.print(";");
            }
        } else {
            System.out.println("There is no chance of winning");
        }

        scanner.close();
    }
}
