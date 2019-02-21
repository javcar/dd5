package org.javi.dd5;

public enum Skill {

    Acrobatic (Ability.Dexterity),
    AnimalHandling (Ability.Wisdom),
    Arcana (Ability.Intelligence),
    Athletic (Ability.Strength),
    Deception (Ability.Charisma),
    History (Ability.Intelligence),
    Insight (Ability.Wisdom),
    Intimidation (Ability.Charisma),
    Investigation (Ability.Intelligence),
    Medicine (Ability.Wisdom),
    Nature (Ability.Intelligence),
    Perception (Ability.Wisdom),
    Performance (Ability.Charisma),
    Persuassion (Ability.Charisma),
    Religion (Ability.Intelligence),
    SleightOfHand (Ability.Dexterity),
    Stealth (Ability.Dexterity),
    Survival (Ability.Wisdom);

    private Ability ability;

    Skill(Ability ability) {
        this.ability = ability;
    }

    public Ability getAbility() {
        return ability;
    }

    @Override
    public String toString() {
        return this.toString() + " (" + this.ability.toString() + ")";
    }
    
}