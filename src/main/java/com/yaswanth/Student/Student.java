package com.yaswanth.Student;

public class Student {
    private String name;
    private char gradeLevel;
    private double gpa;

    public Student(String name, char gradeLevel, double gpa) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
    }

    public void updateGPA(double newGpa) {
        gpa = newGpa;
    }

    public String studentGrade() {
        return name + " has a gpa of " + gpa;
    }
}


