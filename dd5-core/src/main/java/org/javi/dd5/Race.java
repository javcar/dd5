package org.javi.dd5;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

public abstract class Race {

    private Age age;
    private Size size = Size.Medium;
    private int speed = 30;
    private int darkVision = 0;

    private int userAbilityChoiceSlots = 0;
    private int userSkillSlots = 0;

    private EnumMap<Ability, Integer> abilityAdjustments = new EnumMap<Ability, Integer>(Ability.class);
    
    private List<Skill> skillProficiencies = new ArrayList<Skill>();
    private List<SkillFocus> skillFocusProficiencies = new ArrayList<SkillFocus>();    

    private List<Ability> savingThrowProficiencies = new ArrayList<Ability>();
    private List<Threat> threatSavingThrowProficiencies = new ArrayList<Threat>();
    private List<AbilityThreat> abilityThreatSavingThrowProficiencies = new ArrayList<AbilityThreat>();

    
    // General properties

    public Age getAge() {
        return this.age;
    }

    public void setAge(Age age) {
        this.age = age;
    }

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDarkVision() {
        return this.darkVision;
    }

    public void setDarkVision(int darkVision) {
        this.darkVision = darkVision;
    }

    // User choices (abilities)

    public int getUserAbilityChoiceSlots() {
        return this.userAbilityChoiceSlots;
    }

    public void produceUserAbilityChoiceSlots(int choiceSlots) {
        this.userAbilityChoiceSlots += choiceSlots;
    }

    public void consumeUserAbilityChoiceSlot() {
        this.userAbilityChoiceSlots -= 1;
    }

    // User choices (skills)

    public int getUserSkillSlots() {
        return this.userSkillSlots;
    }

    public void produceUserSkillSlots(int skillSlots) {
        this.userSkillSlots += skillSlots;
    }

    public void concumeUserSkillSlots(Skill skill) {
        if (this.userSkillSlots > 0) {
            this.skillProficiencies.add(skill);
            this.userSkillSlots -= 1;
        }
    }

    // Ability checks

    public EnumMap<Ability, Integer> getAbilityAdjustments() {
        return this.abilityAdjustments;
    }

    // Skill checks

    public List<Skill> getSkillProficiencies() { // add proficiency bonus to skill (ability) checks.
        return this.skillProficiencies;
    }

    public List<SkillFocus> getSkillFocusProficiencies() { // add double proficiency bonus to skill checks (ability, focus).
        return this.skillFocusProficiencies;
    }

    // Saving throw checks

    public List<Ability> getSavingThrowProficiencies() { // adventage on saving throws vs that ability.
        return this.savingThrowProficiencies;
    }

    public List<Threat> getThreatSavingThrowProficiencies() { // adventage on saving throws vs that threat.
        return this.threatSavingThrowProficiencies;
    }

    public List<AbilityThreat> getAbilityThreatSavingThrowProficiencies() { // adventage on saving throws vs that ability & threat.
        return this.abilityThreatSavingThrowProficiencies;
    }
    
}