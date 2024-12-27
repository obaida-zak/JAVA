package models;

public class Student extends Person {
    String parentPhNumber;

    public Student(String name, int age, String parentPhNumber) {
        super(name, age);
        this.parentPhNumber = parentPhNumber;
    }

    public Student(String parentPhNumber) {
        this.parentPhNumber = parentPhNumber;
    }

    public Student() {
    }

    public String getParentPhNumber() {
        return parentPhNumber;
    }

    public void setParentPhNumber(String parentPhNumber) {
        this.parentPhNumber = parentPhNumber;
    }
}
