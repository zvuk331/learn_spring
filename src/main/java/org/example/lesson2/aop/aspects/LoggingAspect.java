package org.example.lesson2.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.example.lesson2.aop.Book;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class LoggingAspect {

    /*@Pointcut("execution(public void org.example.lesson2.aop.UniversityLibrary.getMagazine())")
    private void getMagazineMethods(){}

    @Pointcut("allMethods() && !getMagazineMethods()")
    private void allMethodsExceptGetMagazineMethod(){}*/

    @Before("org.example.lesson2.aop.aspects.MyPointcut.allAddMethods()")
    public void beforeGetLoggingMethodAdvice(JoinPoint joinPoint){
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());
        System.out.println("beforeGetLoggingMethodAdvice: Проверка авторизации");

        if (methodSignature.getName().equals("addBook")){
            Object[] arguments = joinPoint.getArgs();
            for (Object obj : arguments){
                if (obj instanceof Book){
                    Book myBook = (Book) obj;
                    System.out.println(
                            "Информация о книге: название: " + myBook.getName() +
                                    ", автор: " + myBook.getAuthor() +
                            ", год публикации: " + myBook.getYearOfPublication()
                        );
                } else if (obj instanceof String){
                    System.out.println("Книгу в библиотеку добавляет " + obj);
                }
            }
        }
    }

    /*@Pointcut("execution(* org.example.lesson2.aop.UniversityLibrary.get*(..))")
    private void allGetMethods(){}

    @Pointcut("execution(* org.example.lesson2.aop.UniversityLibrary.return*(..))")
    private void allReturnMethods(){}

    @Pointcut("allGetMethods() || allReturnMethods()")
    private void allGetAndReturnMethods(){}*/


    /*@Before("execution(public void get*())")
    public void beforeGetBookAdvice(){
        System.out.println("beforeGetBookAdvice: попытка получить книгу.");
    }*/

    /*@Before("allGetAndReturnMethods()")
    public void beforeGetAndReturnMethodsAdvice(){
        System.out.println("beforeGetAndReturnMethodsAdvice: пытаемся получить/вернуть книгу");
    }*/

    /*@Before("allGetMethods()")
    public void beforeGetBookAdvice(){
        System.out.println("beforeGetBookAdvice: попытка получить книгу.");
    }

    @Before("execution( * returnBook())")
    public void beforeReturnBookAdvice(){
        System.out.println("beforeReturnBookAdvice: попытка вернуть книгу.");
    }

    @Before("execution( * getResponse(String))")
    public void beforeResponseAdvice(){
        System.out.println("beforeResponseAdvice: задаём вопрос.");
    }

    @Before("execution( * *(..))")
    public void beforeAnyMethodAdvice(){
        System.out.println("beforeAnyMethodAdvice: этот метод выполняется при вызове любых методов.");
    }*/
}
