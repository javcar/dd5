package org.javi.dd5;

public class DwarfRace extends Race {

    public DwarfRace() {

        setSpeed(25);
        setSize(Size.Medium);
        setDarkVisionRange(60);
        setAdultAge(50);

        /* Ability adjustments granted by race */
        getGrantedAbilityAdjustments().put(Ability.Constitution, +2);

        /* Languages granted by race */
        getGrantedLanguages().add(Language.Common);
        getGrantedLanguages().add(Language.Dwarven);

        grantDwarvenResilience();
        grantDwarvenCombatTraining();
        offerToolProficiencies();
        grantSkillProficiencies();

    }

    private void grantDwarvenResilience() {
        getGrantedSavingThrowAdvantages().add(Damage.Poison);
        getGrantedResistances().add(Damage.Poison);
    }

    private void grantDwarvenCombatTraining() {
        getGrantedWeaponProficiencies().add(Weapon.BattleAxe);
        getGrantedWeaponProficiencies().add(Weapon.HandAxe);
        getGrantedWeaponProficiencies().add(Weapon.LightHammer);
        getGrantedWeaponProficiencies().add(Weapon.WarHammer);
    }

    private void offerToolProficiencies() {
        setToolProficiencySlots(1);
        getOfferedToolProficiencies().add(Tool.Smith);
        getOfferedToolProficiencies().add(Tool.Brewer);
        getOfferedToolProficiencies().add(Tool.Mason);
    }

    private void grantSkillProficiencies() {
        getGrantedSkillProficiencies().add(Skill.History);
    }
    
}