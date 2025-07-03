public class Battle {
    Platoon own;
    Platoon opp;

    public Battle(Platoon own, Platoon opp) {
        this.own = own;
        this.opp = opp;
    }

    public String getOutcome() {
        int ownEffective = own.getEffectiveStrength(opp);
        if (ownEffective > opp.count) return "Win";
        if (ownEffective < opp.count) return "Lose";
        return "Draw";
    }
}