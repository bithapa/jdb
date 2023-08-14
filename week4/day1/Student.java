
/**
 Exercise 3: Exercise 1: Custom Class - Student
 Create a custom class Student with the following attributes: name (String), age (int), and grade (double).
 Implement a Java program that uses an ArrayList to store a list of students and performs the following tasks:

 Create and add several student objects to the ArrayList.
 Find and print the average grade of all students.
 Print the name and age of all students who have a grade higher than 90.
 * */
package week4.jdb.takeo.day16;

import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Max", 12, 76.7));
        students.add(new Student("Jack", 15, 90.45));
        students.add(new Student("Harry", 11, 88.00));
        students.add(new Student("Bob", 11, 88));
        students.add(new Student("Dan", 13, 93.25));

        double total = 0;
        for (Student s : students)
            total += s.getGrade();

        System.out.println("The average grade is:" + total / students.size());

        for (Student s : students)
            if (s.getGrade() > 90)
                System.out.println("Name: " + s.getName() + ", Age: " + s.getAge());
    }
}
