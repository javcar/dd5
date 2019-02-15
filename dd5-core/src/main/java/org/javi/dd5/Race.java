package org.javi.dd5;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

public abstract class Race {

    private int speed = 30;
    private Size size = Size.Medium;
    private int darkVisionRange = 0;
    private int adultAge;
    private int toolProficiencySlots = 0;
    private int hitPointsBonusWhenLevelUp = 0;

    private EnumMap<Ability, Integer> grantedAbilityAdjustments = new EnumMap<Ability, Integer>(Ability.class);
    private List<Language> grantedLanguages = new ArrayList<Language>();    
    private List<Damage> grantedSavingThrowAdvantages = new ArrayList<Damage>();
    private List<Damage> grantedResistances = new ArrayList<Damage>();
    private List<Skill> grantedSkillProficiencies = new ArrayList<Skill>();
    private List<Armor> grantedArmorProficiencies = new ArrayList<Armor>();
    private List<Weapon> grantedWeaponProficiencies = new ArrayList<Weapon>();
    private List<Tool> offeredToolProficiencies = new ArrayList<Tool>();    

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public int getDarkVisionRange() {
        return this.darkVisionRange;
    }

    public void setDarkVisionRange(int darkVisionRange) {
        this.darkVisionRange = darkVisionRange;
    }

    public boolean canSeeInDarkness() {
        return this.darkVisionRange != 0;
    }

    public int getAdultAge() {
        return this.adultAge;
    }

    public void setAdultAge(int adultAge) {
        this.adultAge = adultAge;
    }

    public int getToolProficiencySlots() {
        return this.toolProficiencySlots;
    }

    public void setToolProficiencySlots(int toolProficiencySlots) {
        this.toolProficiencySlots = toolProficiencySlots;
    }

    public int getHitPointsBonusWhenLevelUp() {
        return this.hitPointsBonusWhenLevelUp;
    }

    public void setHitPointsBonusWhenLevelUp(int hitPointsBonusWhenLevelUp) {
        this.hitPointsBonusWhenLevelUp = hitPointsBonusWhenLevelUp;
    }

    public EnumMap<Ability, Integer> getGrantedAbilityAdjustments() {
        return this.grantedAbilityAdjustments;
    }

    public List<Language> getGrantedLanguages() {
        return this.grantedLanguages;
    }

    public List<Damage> getGrantedSavingThrowAdvantages() {
        return this.grantedSavingThrowAdvantages;
    }

    public List<Damage> getGrantedResistances() {
        return this.grantedResistances;
    }

    public List<Skill> getGrantedSkillProficiencies() {
        return this.grantedSkillProficiencies;
    }

    public List<Armor> getGrantedArmorProficiencies() {
        return this.grantedArmorProficiencies;
    }

    public List<Weapon> getGrantedWeaponProficiencies() {
        return this.grantedWeaponProficiencies;
    }

    public List<Tool> getOfferedToolProficiencies() {
        return this.offeredToolProficiencies;
    }

    public void collectSpeedAdjustments() {
        /* Empty method */
    }
    
}