package org.example.lesson2.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {
    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturnBookLoggingAdvice: начинаем возврат книги");
        long begin = System.currentTimeMillis();
        Object targetResultMethod = proceedingJoinPoint.proceed();
        long end = System.currentTimeMillis();

        System.out.println("aroundReturnBookLoggingAdvice: возвращаем книгу");
        System.out.println("aroundReturnBookLoggingAdvice: скорость выполнения метода " + (end-begin) + " миллисекунд");

        return targetResultMethod;
    }
}
