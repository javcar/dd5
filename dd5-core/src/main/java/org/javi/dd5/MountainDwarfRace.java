package org.javi.dd5;

public class MountainDwarfRace extends DwarfRace {
    
    public MountainDwarfRace() {
        super();

        /* Ability adjustments granted by subrace */
        getGrantedAbilityAdjustments().put(Ability.Strength, +2);

        grantDwarvenArmorTraining();

    }

    private void grantDwarvenArmorTraining() {
        getGrantedArmorProficiencies().addAll(Armor.getArmors(ArmorCategory.Light));
        getGrantedArmorProficiencies().addAll(Armor.getArmors(ArmorCategory.Medium));
    }

}