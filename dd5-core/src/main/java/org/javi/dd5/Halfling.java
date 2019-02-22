package org.javi.dd5;

public abstract class Halfling extends Race {

    public Halfling() {

        setAge(new Age(20, 150));
        setSize(Size.Small);
        setSpeed(25);        

        getAbilityAdjustments().put(Ability.Dexterity, +2);

        grantLucky();
        grantBrave();
        grantNimbleness();

        getLanguages().add(Language.Common);
        getLanguages().add(Language.Halfling);
                
    }

    // Helper methods

    private void grantLucky() {
        setIsLucky(true);
    }

    private void grantBrave() {
        getThreatSavingThrowProficiencies().add(Threat.Fear);
    }

    private void grantNimbleness() {
        setcanMoveThroughLargerCreature(true);
    }

}