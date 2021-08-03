package com.example.fragmentWe;

import java.io.Serializable;

public class Model implements Serializable {

    private String name;
    private String grade;
    private String percentage;
    private String age;

    public Model(String name, String grade, String percentage, String age) {
        this.name = name;
        this.grade = grade;
        this.percentage = percentage;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public String getPercentage() {
        return percentage;
    }

    public String getAge() {
        return age;
    }
}
