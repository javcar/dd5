package org.javi.dd5;

public class SkillFocus {

    private Skill skill;
    private Focus focus;

    public SkillFocus(Skill skill, Focus focus) {
        this.skill = skill;
        this.focus = focus;
    }

    public Skill getSkill() {
        return this.skill;
    }

    public Focus getFocus() {
        return this.focus;
    }

    @Override
    public String toString() {
        return this.skill.toString() + " focused on " + this.focus.toString();
    }
    
}