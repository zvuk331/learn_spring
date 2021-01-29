package org.example.lesson2.aop;

import org.springframework.stereotype.Component;

@Component
public class UniversityLibrary extends AbstractLibrary{
    @Override
    public void getBook(){
        System.out.println("Мы берём книгу из библиотеки университета.");
        System.out.println("-------------------------------------------------");
    }

    public void getMagazine(){
        System.out.println("Мы берём журнал.");
        System.out.println("-------------------------------------------------");
    }

    public String returnBook(){
        System.out.println("Возвращаем книгу в библиотеку.");
        return "Война и мир";
    }

    public void addBook(String person_name, Book book){

        System.out.println("Добавляем " + book.getName() + " в библиотеку");
        System.out.println("-------------------------------------------------");
    }


}
