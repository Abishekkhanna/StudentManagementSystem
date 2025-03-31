package com.demo.model;

public class Student {
    private int roll;
    private String name;
    private String clgname;
    private String city;
    private double percentage;
    
    public Student(){

    }

    public Student(int roll, String name, String clgname, String city, double percentage) {
        this.roll = roll;
        this.name = name;
        this.clgname = clgname;
        this.city = city;
        this.percentage = percentage;
    }
    
    public Student(String name, String clgname, String city, double percentage) {
        this.name = name;
        this.clgname = clgname;
        this.city = city;
        this.percentage = percentage;
    }


    public int getRoll() {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getClgname() {
        return clgname;
    }
    public void setClgname(String clgname) {
        this.clgname = clgname;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public double getPercentage() {
        return percentage;
    }
    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public String toString() {
        return "Student [roll=" + roll + ", name=" + name + ", clgname=" + clgname + ", city=" + city + ", percentage="
                + percentage + "]";
    }

    
}
