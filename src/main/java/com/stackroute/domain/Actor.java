package com.stackroute.domain;

public class Actor  {
    String name;
    String gender;
    int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void print()
    {
        System.out.println("Name:"+ name + "gender:"+ gender + "Age:" +age);
    }
}
