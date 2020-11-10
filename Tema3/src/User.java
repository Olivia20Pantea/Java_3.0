package com.company;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String married;
    private String adress;

    public User(String firstName, String lastName, int age, String gender, String married, String adress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.married = married;
        this.adress = adress;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String isMarried() {
        return married;
    }

    public void setMarried(String married) {
        this.married = married;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}