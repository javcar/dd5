package org.javi.dd5;

public abstract class Dwarf extends Race {

    public Dwarf() {

        setAge(new Age(50, 280));
        setSpeed(25);
        setDarkVision(60);

        getAbilityAdjustments().put(Ability.Constitution, +2);

        grantResilience();
        grantCombatTraining();
        grantToolProficiency();
        grantStoneCunning();

        getLanguages().add(Language.Common);
        getLanguages().add(Language.Dwarven);
    }

    // Helper methods

    private void grantResilience() {
        getThreatSavingThrowProficiencies().add(Threat.Poison);
        getThreatImmunities().add(Threat.Poison);
    }

    private void grantCombatTraining() {
        getWeaponProficiencies().add(Weapon.BattleAxe);
        getWeaponProficiencies().add(Weapon.HandAxe);
        getWeaponProficiencies().add(Weapon.LightHammer);
        getWeaponProficiencies().add(Weapon.WarHammer);        
    }

    private void grantToolProficiency() {
        produceUserChoiceToolSlots(1);
        getUserChoiceToolOptions().add(Tool.Smith);
        getUserChoiceToolOptions().add(Tool.Brewer);
        getUserChoiceToolOptions().add(Tool.Mason);
    }

    private void grantStoneCunning() {
        getSkillFocusProficiencies().add(new SkillFocus(Skill.History, Focus.Stone));
    }

}