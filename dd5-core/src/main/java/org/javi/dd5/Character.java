package org.javi.dd5;

public abstract class Character {

    private Abilities abilities;

    private Race race;

    // General properties

    private int age;

    public Abilities getAbilities() {
        return this.abilities;
    }

    public Character(Race race) {
        this.race = race;
    }

    // General properties

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void consumeUserAbilityChoiceSlots(Ability ability) {
        if (this.race.getUserAbilityChoiceSlots() > 0) {
            this.abilities.increaseScore(ability, +1);
            this.race.consumeUserAbilityChoiceSlot();
        }
    }
    
}