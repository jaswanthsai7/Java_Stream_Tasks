/*
 * Author Name : Jaswanth Sai
 * Date : 9/13/2022
 * Created With: INTELLIJ IDEA COMMUNITY EDITION
 */
package com.github.jaswanth.task1;

import java.util.Objects;

public class Student {
    // store the rollNumber of a student, as a primitive byte type
    private byte rollNumber;
    //store the first name of a student, as a reference String type value.
    private String firstName;
    //to store the last name of a student, as a reference String type value
    private String secondName;
    //store the current year of a student, as a primitive byte type value.
    private byte year;

    public Student() {
    }

    public Student(byte rollNumber, String firstName, String secondName, byte year) {
        this.rollNumber = rollNumber;
        this.firstName = firstName;
        this.secondName = secondName;
        this.year = year;
    }

    public byte getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(byte rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public byte getYear() {
        return year;
    }

    public void setYear(byte year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getRollNumber() == student.getRollNumber() && getYear() == student.getYear() && Objects.equals(getFirstName(), student.getFirstName()) && Objects.equals(getSecondName(), student.getSecondName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRollNumber(), getFirstName(), getSecondName(), getYear());
    }

    @Override
    public String toString() {
        return "Student{" + "rollNumber=" + rollNumber + ", firstName='" + firstName + '\'' + ", secondName='" + secondName + '\'' + ", year=" + year + '}';
    }
}
