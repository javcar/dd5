package org.javi.dd5;

public class FighterProfession extends Profession {

    public FighterProfession() {

        setHitDice(10);

        /* Skill proficiencies granted by class */
        getGrantedProficientSkills().add(Skill.Athletics);
        getGrantedProficientSkills().add(Skill.History);
        getGrantedProficientSkills().add(Skill.Perception);
        getGrantedProficientSkills().add(Skill.Persuassion);

        /* Saving Throw proficiencies granted by class */
        getGrantedProficientSavingThrows().add(Ability.Strength);
        getGrantedProficientSavingThrows().add(Ability.Constitution);
    }
    
}