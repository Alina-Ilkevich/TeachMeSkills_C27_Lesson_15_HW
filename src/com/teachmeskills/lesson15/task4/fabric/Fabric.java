package com.teachmeskills.lesson15.task4.fabric;

import com.teachmeskills.lesson15.task4.student.Student;

import java.util.HashSet;
import java.util.Set;

public class Fabric {
    public static void showInfo() {
        Set<Student> students = new HashSet<>();
        students.add(new Student("Artem"));
        students.add(new Student("Alina"));
        students.add(new Student("Anastasia"));
        students.add(new Student("Artem"));
        students.add(new Student("Nikita"));
        students.add(new Student("Oleg"));
        students.add(new Student("Ivan"));
        students.add(new Student("Kirill"));
        students.add(new Student("Ruslan"));
        students.add(new Student("Evgeniy"));
        students.add(new Student("Pavel"));
        students.add(new Student("Ruslan"));
        students.add(new Student("Alexander"));
        students.add(new Student("Daniil"));
        students.add(new Student("Alexey"));
        students.add(new Student("Vladislav"));
        students.add(new Student("Andrew"));
        System.out.println(students);
    }
}
