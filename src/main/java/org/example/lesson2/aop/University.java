package org.example.lesson2.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudent(){
        Student student1 = new Student("Lissin Pavel", 1,8.0);
        Student student2 = new Student("Sokolova Elena", 2,9.0);
        Student student3 = new Student("Koval Denis", 1,9.5);

        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    public List<Student> getStudents(){
        System.out.println("Information from getStudents meghod: ");
        System.out.println(students);
        return students;
    }
}
