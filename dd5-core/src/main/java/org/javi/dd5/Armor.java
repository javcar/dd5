package org.javi.dd5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Armor {

    Padded (ArmorCategory.Light), 
    Leather (ArmorCategory.Light), 
    StuddedLeather (ArmorCategory.Light),
    Hide (ArmorCategory.Medium), 
    ChainShirt (ArmorCategory.Medium), 
    ScaleMail (ArmorCategory.Medium), 
    BreastPlate (ArmorCategory.Medium), 
    HalfPlate (ArmorCategory.Medium),
    RingMail (ArmorCategory.Heavy), 
    ChainMail (ArmorCategory.Heavy), 
    Splint (ArmorCategory.Heavy), 
    Plate (ArmorCategory.Heavy);

    private ArmorCategory armorCategory;
    
    Armor(ArmorCategory armorCategory) {
        this.armorCategory = armorCategory;
    }

    public ArmorCategory getArmorCategory() {
        return this.armorCategory;
    }

    public static List<Armor> getArmors(ArmorCategory armorCategory) {        
        return Stream.of(Armor.values()).filter(armor -> armor.getArmorCategory().equals(armorCategory)).collect(Collectors.toList());
    }

}