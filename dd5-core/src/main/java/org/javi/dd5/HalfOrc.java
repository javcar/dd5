package org.javi.dd5;

public abstract class HalfOrc extends Race {

    public HalfOrc() {

        setAge(new Age(14, 75));                
        setDarkVision(60);

        getAbilityAdjustments().put(Ability.Strength, +2);
        getAbilityAdjustments().put(Ability.Constitution, +1);

        getSkillProficiencies().add(Skill.Intimidation);

    }

}