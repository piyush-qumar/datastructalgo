import java.util.*;

public class Army {
    List<Platoon> platoons;

    public Army(List<Platoon> platoons) {
        this.platoons = platoons;
    }

    public List<Platoon> findWinningArrangementAgainst(Army opponent) {
        List<List<Platoon>> permutations = generatePermutations(platoons);

        for (List<Platoon> perm : permutations) {
            int wins = 0;
            for (int i = 0; i < perm.size(); i++) {
                Battle battle = new Battle(perm.get(i), opponent.platoons.get(i));
                if (battle.getOutcome().equals("Win")) {
                    wins++;
                }
            }
            if (wins >= 3) return perm;
        }
        return null;
    }

    // Generate all permutations of platoons
    private List<List<Platoon>> generatePermutations(List<Platoon> original) {
        List<List<Platoon>> result = new ArrayList<>();
        permute(original, 0, result);
        return result;
    }

    private void permute(List<Platoon> arr, int k, List<List<Platoon>> result) {
        if (k == arr.size()) {
            result.add(new ArrayList<>(arr));
        } else {
            for (int i = k; i < arr.size(); i++) {
                Collections.swap(arr, i, k);
                permute(arr, k + 1, result);
                Collections.swap(arr, k, i);
            }
        }
    }
}
