package com.wildcodeschool.doctor.model;

public class Doctor {

    private int number;
    private String name;

    public Doctor() {
    }

    public Doctor(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrentDoctor() {
        if (this.number == 13) {
            return this.name + " is the before last doctor";
        } else if (this.number ==14) {
            return this.name + " is the current doctor";
        } else if (this.number ==15) {
            return this.name + " is the next doctor";
        } else {
            return this.name + " is not the current doctor";
        }

    }
}
