package org.javi.dd5;

public abstract class Elf extends Race {

    public Elf() {

        setAge(new Age(100, 750));
        setDarkVision(60);

        getAbilityAdjustments().put(Ability.Dexterity, +2);

        grantKeenSenses();
        grantFeyAncestry();
        grantTrance();

        getLanguages().add(Language.Common);
        getLanguages().add(Language.Elvish);

    }

    // Helper methods

    private void grantKeenSenses() {
        getSkillProficiencies().add(Skill.Perception);
    }

    private void grantFeyAncestry() {
        getThreatSavingThrowProficiencies().add(Threat.Charm);
        getThreatImmunities().add(Threat.MagicSleep);
    }

    private void grantTrance() {
        setFullRestDuration(4);
    }

}