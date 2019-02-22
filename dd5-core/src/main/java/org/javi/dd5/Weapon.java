package org.javi.dd5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Weapon {

    GreatAxe (WeaponCategory.Martial), 
    BattleAxe (WeaponCategory.Martial), 
    HandAxe (WeaponCategory.Simple), 
    LightHammer (WeaponCategory.Simple), 
    WarHammer (WeaponCategory.Martial), 
    ShortSword (WeaponCategory.Martial), 
    LongSword (WeaponCategory.Martial), 
    ShortBow (WeaponCategory.Simple), 
    LongBow (WeaponCategory.Martial);

    private WeaponCategory weaponCategory;
    
    Weapon(WeaponCategory weaponCategory) {
        this.weaponCategory = weaponCategory;
    }

    public WeaponCategory getWeaponCategory() {
        return this.weaponCategory;
    }

    public static List<Weapon> getWeapons(WeaponCategory weaponCategory) {        
        return Stream.of(Weapon.values()).filter(weapon -> weapon.getWeaponCategory().equals(weaponCategory)).collect(Collectors.toList());
    }

}