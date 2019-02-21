package org.javi.dd5;

public class AbilityThreat {

    private Ability ability;
    private Threat threat;

    public AbilityThreat(Ability ability, Threat threat) {
        this.ability = ability;
        this.threat = threat;
    }

    public Ability getAbility() {
        return this.ability;
    }

    public Threat getThreat() {
        return this.threat;
    }

    @Override
    public String toString() {
        return this.ability.toString() + " focused on " + this.threat.toString();
    }
    
}