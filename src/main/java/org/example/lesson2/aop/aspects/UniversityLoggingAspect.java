package org.example.lesson2.aop.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.example.lesson2.aop.Student;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice(){
        System.out.println("beforeGetStudentsLoggingAdvice: логирование");
    }

    @AfterReturning(pointcut = "execution(* getStudents())",
    returning = "students")
    public void afterReturningStudentsLoggingAdvice(List<Student> students){
        students.clear();
        System.out.println("afterReturningStudentsLoggingAdvice: логирование");

    }

    @After("execution(* getStudents())")
    public void afterGetStudentsAdvice(){
        System.out.println("afterGetStudentsAdvice: выполнился.");
    }
}
