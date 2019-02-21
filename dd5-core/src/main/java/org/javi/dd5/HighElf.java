package org.javi.dd5;

public abstract class HighElf extends Elf {

    public HighElf() {
        
        super();

        getAbilityAdjustments().put(Ability.Intelligence, +1);
        produceUserAbilityChoiceSlots(+2);
    }

}