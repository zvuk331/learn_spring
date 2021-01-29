package org.example.lesson2.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        UniversityLibrary universityLibrary = context.getBean("universityLibrary", UniversityLibrary.class);

        Book book = context.getBean("book", Book.class);
        universityLibrary.addBook("Pavel", book);
        universityLibrary.getBook();
        universityLibrary.getMagazine();
        universityLibrary.returnBook();
//        String answer = universityLibrary.getResponse("Question");
//        System.out.println(answer);

//        SchoolLibrary schoolLibrary = context.getBean("schoolLibrary", SchoolLibrary.class);
//        schoolLibrary.getBook();


        context.close();
    }
}
