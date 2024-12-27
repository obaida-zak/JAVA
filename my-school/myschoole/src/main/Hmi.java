package main;

import models.School;
import models.Student;
import schoolServices.SchoolServices;

import java.util.Scanner;

public class Hmi {
    private static SchoolServices schoolServices;
    public static void start(){
        Scanner scanner = new Scanner(System.in);
        School school = Hmi.creatSchool();
        System.out.println("Welcome to " + school.getName() + " in " + school.getAdress());
            String action;
        do{
            System.out.println("What do you want to do ");
            action = scanner.next();

            switch (action){
                case "addStudent":
                    Hmi.addStudent();
                break;
                case "printAllStudents":
                    Hmi.printAllStudents();
                break;
            }


        }while(!action.equals("exit"));
    }




    private static  School creatSchool(){
        School school = new School();
        school.setName("Java Online");
        school.setAdress("Blegium");
        school.setPhoneNumber("+32789112233");
        Hmi.schoolServices = new SchoolServices(school);
        return school;
    }

    private static void addStudent(){
        Scanner reader = new Scanner(System.in);
        Student student = new Student();
        System.out.println("PLZ enter the name student");
        student.setName(reader.next());
        System.out.println("Plz enter the age");
        student.setAge(reader.nextInt());
        System.out.println("Plz enter the phone number");
        student.setParentPhNumber(reader.next());
        Hmi.schoolServices.addStudent(student);
    }
    public static void printAllStudents(){
        for (Student student: Hmi.schoolServices.getSchool().getStudents()) {
            System.out.println(student.getName() + " " + student.getAge() + " " + student.getParentPhNumber());

        }
    }
}
