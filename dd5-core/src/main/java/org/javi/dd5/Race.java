package org.javi.dd5;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

public abstract class Race {

    private Age age;
    private Size size = Size.Medium;
    private int speed = 30;
    private int darkVision = 0;

    private int userChoiceAbilitySlots = 0;
    private int userChoiceSkillSlots = 0;
    private int userChoiceToolSlots = 0;
    private int userChoiceLanguageSlots = 0;

    private List<Tool> userChoiceToolOptions = new ArrayList<Tool>();
    private List<Language> userChoiceLanguageOptions = new ArrayList<Language>();

    private int hitPointBonusPerLevel = 0;
    private int fullRestDuration = 8;
    private boolean isLucky = false;
    private boolean canMoveThroughLargerCreature = false;

    private EnumMap<Ability, Integer> abilityAdjustments = new EnumMap<Ability, Integer>(Ability.class);
    
    private List<Skill> skillProficiencies = new ArrayList<Skill>();
    private List<SkillFocus> skillFocusProficiencies = new ArrayList<SkillFocus>();    

    private List<Ability> savingThrowProficiencies = new ArrayList<Ability>();
    private List<Threat> threatSavingThrowProficiencies = new ArrayList<Threat>();
    private List<AbilityThreat> abilityThreatSavingThrowProficiencies = new ArrayList<AbilityThreat>();
    private List<Threat> threatImmunities = new ArrayList<Threat>();

    private List<Tool> toolProficiencies = new ArrayList<Tool>();

    private List<Armor> armorProficiencies = new ArrayList<Armor>();
    private List<Weapon> weaponProficiencies = new ArrayList<Weapon>();

    private List<Language> languages = new ArrayList<Language>();
    
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

    public int getHitPointBonusPerLevel() {
        return this.hitPointBonusPerLevel;
    }

    public void setHitPointBonusPerLevel(int hitPoints) {
        this.hitPointBonusPerLevel = hitPoints;
    }

    public int getFullRestDuration() {
        return this.fullRestDuration;
    }

    public void setFullRestDuration(int restDuration) {
        this.fullRestDuration = restDuration;
    }

    public boolean getIsLucky() {
        return this.isLucky;
    }

    public void setIsLucky(boolean isLucky) {
        this.isLucky = isLucky;
    }

    public boolean getCanMoveThroughLargerCreature() {
        return this.canMoveThroughLargerCreature;
    }

    public void setcanMoveThroughLargerCreature(boolean canMoveThroughLargerCreature) {
        this.canMoveThroughLargerCreature = canMoveThroughLargerCreature;
    }

    // User choices (abilities)

    public int getUserChoiceAbilitySlots() {
        return this.userChoiceAbilitySlots;
    }

    public void produceUserChoiceAbilitySlots(int abilitySlots) {
        this.userChoiceAbilitySlots += abilitySlots;
    }

    public void consumeUserChoiceAbilitySlot() {
        this.userChoiceAbilitySlots -= 1;
    }

    // User choices (skills)

    public int getUserChoiceSkillSlots() {
        return this.userChoiceSkillSlots;
    }

    public void produceUserChoiceSkillSlots(int skillSlots) {
        this.userChoiceSkillSlots += skillSlots;
    }

    public void consumeUserChoiceSkillSlots(Skill skill) {
        this.userChoiceSkillSlots -= 1;
    }

    // User choices (tools)

    public int getUserChoiceToolSlots() {
        return this.userChoiceToolSlots;
    }

    public void produceUserChoiceToolSlots(int toolSlots) {
        this.userChoiceToolSlots += toolSlots;
    }

    public void consumeUserChoiceToolSlot() {
        this.userChoiceToolSlots -= 1;
    }

    public List<Tool> getUserChoiceToolOptions() {
        return this.userChoiceToolOptions;
    }

    // User choices (languages)

    public int getUserChoiceLanguageSlots() {
        return this.userChoiceLanguageSlots;
    }

    public void produceUserChoiceLanguageSlots(int languageSlots) {
        this.userChoiceLanguageSlots += languageSlots;
    }

    public void consumeUserChoiceLanguageSlot() {
        this.userChoiceLanguageSlots -= 1;
    }

    public List<Language> getUserChoiceLanguageOptions() {
        return this.userChoiceLanguageOptions;
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

    // Immunities

    public List<Threat> getThreatImmunities() {
        return this.threatImmunities;
    }

    // Tool proficiencies

    public List<Tool> getToolProficiencies() {
        return this.toolProficiencies;
    }

    // Armor & Weapon proficiencies

    public List<Armor> getArmorProficiencies() {
        return this.armorProficiencies;
    }

    public List<Weapon> getWeaponProficiencies() {
        return this.weaponProficiencies;
    }

    // Languages

    public List<Language> getLanguages() {
        return this.languages;
    }
    
}