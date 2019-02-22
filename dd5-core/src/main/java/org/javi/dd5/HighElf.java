package org.javi.dd5;

public abstract class HighElf extends Elf {

    public HighElf() {
        
        super();

        getAbilityAdjustments().put(Ability.Intelligence, +1);

        grantWeaponTraining();
        grantCantrip();
        grantExtraLanguage();

    }

    // Helper methods

    private void grantWeaponTraining() {
        getWeaponProficiencies().add(Weapon.LongSword);
        getWeaponProficiencies().add(Weapon.ShortSword);
        getWeaponProficiencies().add(Weapon.LongBow);
        getWeaponProficiencies().add(Weapon.ShortBow); 
    }

    private void grantCantrip() {
        throw new UnsupportedOperationException(); // TODO
    }

    private void grantExtraLanguage() {
        produceUserChoiceLanguageSlots(1);
        getUserChoiceLanguageOptions().addAll(Language.getLanguages());
    }

}