import java.util.*;
public class Platoon {
    String unitClass;
    int count;
    private static final Map<String, List<String>> advantageMap = new HashMap<>();
    static {
        advantageMap.put("Militia", Arrays.asList("Spearmen", "LightCavalry"));
        advantageMap.put("Spearmen", Arrays.asList("LightCavalry", "HeavyCavalry"));
        advantageMap.put("LightCavalry", Arrays.asList("FootArcher", "CavalryArcher"));
        advantageMap.put("HeavyCavalry", Arrays.asList("Militia", "FootArcher", "LightCavalry"));
        advantageMap.put("CavalryArcher", Arrays.asList("Spearmen", "HeavyCavalry"));
        advantageMap.put("FootArcher", Arrays.asList("Militia", "CavalryArcher"));
    }
    public Platoon(String unitClass, int count) {
        this.unitClass = unitClass;
        this.count = count;
    }
    public int getEffectiveStrength(Platoon opponent) {
        List<String> advantageOver = advantageMap.getOrDefault(this.unitClass, new ArrayList<>());
        if (advantageOver.contains(opponent.unitClass)) {
            return this.count * 2;
        }
        return this.count;
    }   
     @Override
    public String toString() {
        return unitClass + "#" + count;
    }
}
