package org.javi.dd5;

public abstract class LightfootHalfling extends Halfling {

    public LightfootHalfling() {
        
        super();

        getAbilityAdjustments().put(Ability.Charisma, +1);
    }

}