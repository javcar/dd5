package org.javi.dd5;

public abstract class Human extends Race {

    public Human() {

        setAge(new Age(18, 100));        

        getAbilityAdjustments().put(Ability.Strength, +1);
        getAbilityAdjustments().put(Ability.Dexterity, +1);
        getAbilityAdjustments().put(Ability.Constitution, +1);
        getAbilityAdjustments().put(Ability.Intelligence, +1);
        getAbilityAdjustments().put(Ability.Wisdom, +1);
        getAbilityAdjustments().put(Ability.Charisma, +1);

        grantExtraLanguage();

    }

    // Helper methods

    private void grantExtraLanguage() {
        produceUserChoiceLanguageSlots(1);
        getUserChoiceLanguageOptions().addAll(Language.getLanguages());
    }

}