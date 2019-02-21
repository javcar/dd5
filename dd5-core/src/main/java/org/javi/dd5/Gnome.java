package org.javi.dd5;

public abstract class Gnome extends Race {

    public Gnome() {

        setAge(new Age(40, 500));
        setSize(Size.Small);
        setSpeed(25);
        setDarkVision(60);

        getAbilityAdjustments().put(Ability.Intelligence, +2);

        getSkillFocusProficiencies().add(new SkillFocus(Skill.History, Focus.Magic));
        getSkillFocusProficiencies().add(new SkillFocus(Skill.History, Focus.Alchemy));
        getSkillFocusProficiencies().add(new SkillFocus(Skill.History, Focus.Tech));

        getAbilityThreatSavingThrowProficiencies().add(new AbilityThreat(Ability.Intelligence, Threat.Magic));
        getAbilityThreatSavingThrowProficiencies().add(new AbilityThreat(Ability.Wisdom, Threat.Magic));
        getAbilityThreatSavingThrowProficiencies().add(new AbilityThreat(Ability.Charisma, Threat.Magic));

    }

}