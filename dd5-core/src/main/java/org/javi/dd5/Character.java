package org.javi.dd5;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

public abstract class Character {

    private Abilities abilities = new Abilities();
    private Race race;
    private List<Profession> professions = new ArrayList<Profession>();
    private List<Ability> proficientSavingThrows = new ArrayList<Ability>();
    private List<Skill> proficientSkills = new ArrayList<Skill>();

    public Character() {
        
    }
    
    public Abilities getAbilities() {
        return this.abilities;
    }

    public Race getRace() {
        return this.race;
    }

    public List<Profession> getProfessions() {
        return this.professions;
    }

    public List<Ability> getProficientSavingThrows() {
        return this.proficientSavingThrows;
    }

    public List<Skill> getProficientSkills() {
        return this.proficientSkills;
    }

    public int getLevel() {
        return this.professions.stream().mapToInt(Profession::getLevel).sum();
    }

    public int getProficiencyBonus() {
        return MathUtils.roundDown((7 + this.getLevel()) / 4);
    };

    public int getSpeed() {
        return 0;
    }
    
}