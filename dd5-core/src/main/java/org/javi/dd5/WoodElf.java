package org.javi.dd5;

public abstract class WoodElf extends Elf {

    public WoodElf() {
        
        super();

        getAbilityAdjustments().put(Ability.Wisdom, +1);

        grantWeaponTraining();
        grantFleetOfFoot();
        grantMaskOfTheWild();
    }

     // Helper methods

    private void grantWeaponTraining() {
        getWeaponProficiencies().add(Weapon.LongSword);
        getWeaponProficiencies().add(Weapon.ShortSword);
        getWeaponProficiencies().add(Weapon.LongBow);
        getWeaponProficiencies().add(Weapon.ShortBow); 
    }

    private void grantFleetOfFoot() {
        setSpeed(35);
    }

    private void grantMaskOfTheWild() {
        throw new UnsupportedOperationException(); // TODO
    }

}