package org.javi.dd5;

import java.util.ArrayList;
import java.util.List;

public abstract class Character {

    private Abilities abilities;

    private Race race;

    private List<Tool> toolProficiencies = new ArrayList<Tool>();
    private List<Language> languages = new ArrayList<Language>();



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

    // Proficiencies

    public List<Tool> getToolProficiencies() {
        return this.toolProficiencies;
    }

    public List<Language> getLanguages() {
        return this.languages;
    }

    // Helper methods

    public void consumeUserChoiceAbilitySlot(Ability ability) {
        if (this.race.getUserChoiceAbilitySlots() > 0) {
            this.abilities.increaseScore(ability, +1);
            this.race.consumeUserChoiceAbilitySlot();
        }
    }

    public void consumeUserToolSlots(Tool tool) {
        if (this.race.getUserChoiceToolSlots() > 0) {
            this.toolProficiencies.add(tool);
            this.race.consumeUserChoiceToolSlot();
        }
    }

    public void consumeUserLanguageSlots(Language language) {
        if (this.race.getUserChoiceLanguageSlots() > 0) {
            this.languages.add(language);
            this.race.consumeUserChoiceLanguageSlot();
        }
    }
    
}