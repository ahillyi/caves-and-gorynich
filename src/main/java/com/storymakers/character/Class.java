package com.storymakers.character;

import com.storymakers.character.skill.Skill;

import java.util.List;

//todo to think: Race, Type, Class are quite similar, maybe create superclass for them?
public class Class {
    private String name;

    private String description;

    private List<Skill> skills;

    private int bodyPoints;

    private int intuitionPoints;

    private int mindPoints;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public int getBodyPoints() {
        return bodyPoints;
    }

    public int getIntuitionPoints() {
        return intuitionPoints;
    }

    public int getMindPoints() {
        return mindPoints;
    }


    public static final class Builder {
        private String name;
        private String description;
        private List<Skill> skills;
        private int bodyPoints;
        private int intuitionPoints;
        private int mindPoints;

        private Builder() {
        }

        public static Builder aClass() {
            return new Builder();
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder withSkills(List<Skill> skills) {
            this.skills = skills;
            return this;
        }

        public Builder withBodyPoints(int bodyPoints) {
            this.bodyPoints = bodyPoints;
            return this;
        }

        public Builder withIntuitionPoints(int intuitionPoints) {
            this.intuitionPoints = intuitionPoints;
            return this;
        }

        public Builder withMindPoints(int mindPoints) {
            this.mindPoints = mindPoints;
            return this;
        }

        public Class build() {
            Class clazz = new Class();
            clazz.skills = this.skills;
            clazz.mindPoints = this.mindPoints;
            clazz.name = this.name;
            clazz.description = this.description;
            clazz.bodyPoints = this.bodyPoints;
            clazz.intuitionPoints = this.intuitionPoints;
            return clazz;
        }
    }
}
