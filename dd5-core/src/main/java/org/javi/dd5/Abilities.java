package org.javi.dd5;

import java.util.EnumMap;

public class Abilities {

    private EnumMap<Ability, Integer> abilities = new EnumMap<Ability, Integer>(Ability.class);

    public Abilities() {
        this.abilities.put(Ability.Strength, 10);
        this.abilities.put(Ability.Dexterity, 10);
        this.abilities.put(Ability.Constitution, 10);
        this.abilities.put(Ability.Intelligence, 10);
        this.abilities.put(Ability.Wisdom, 10);
        this.abilities.put(Ability.Charisma, 10);
    }

    public int getScore(Ability ability) {
        return this.abilities.get(ability);
    }

    public int getModifier(Ability ability) {
        return MathUtils.halve(10 - this.abilities.get(ability));        
    }

    public void increaseScore(Ability ability, int score) {
        this.abilities.put(ability, this.abilities.get(ability) + score);
    }
    
}