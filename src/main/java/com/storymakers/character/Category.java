package com.storymakers.character;

import com.storymakers.character.skill.Skill;

import java.util.List;

public class Category {
    private String name;

    private String description;

    private List<Skill> skills;

    //todo to think is it stat?
    private int bodyPoints;

    //todo to think is it stat?
    private int intuitionPoints;

    //todo to think is it stat?
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

    public enum Type {
        RACE,
        CLASS,
        TYPE
    }

    public static final class Builder {
        private String name;
        private String description;
        private List<Skill> skills;
        //todo to think is it stat?
        private int bodyPoints;
        //todo to think is it stat?
        private int intuitionPoints;
        //todo to think is it stat?
        private int mindPoints;

        private Builder() {
        }

        public static Builder aCategory() {
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

        public Category build() {
            Category category = new Category();
            category.mindPoints = this.mindPoints;
            category.bodyPoints = this.bodyPoints;
            category.skills = this.skills;
            category.name = this.name;
            category.intuitionPoints = this.intuitionPoints;
            category.description = this.description;
            return category;
        }
    }
}
