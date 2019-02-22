package org.javi.dd5;

public abstract class MountainDwarf extends Dwarf {

    public MountainDwarf() {
        
        super();

        getAbilityAdjustments().put(Ability.Strength, +2);

        grantArmorTraining();
    }

    // Helper methods

    private void grantArmorTraining() {
        getArmorProficiencies().addAll(Armor.getArmors(ArmorCategory.Light));
        getArmorProficiencies().addAll(Armor.getArmors(ArmorCategory.Medium));
    }

}