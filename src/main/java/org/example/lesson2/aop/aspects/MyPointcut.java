package org.example.lesson2.aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcut {
    @Pointcut("execution(* org.example.lesson2.aop.UniversityLibrary.abc*(..))")
    public void allAddMethods(){}
}
