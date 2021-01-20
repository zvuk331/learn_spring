package org.example.lesson1;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Cat implements Pet{
    @Override
    public void run() {
        System.out.println("I cat");
    }

    public Cat() {
    }
    @PostConstruct
    public void init(){
        System.out.println("Cat is create");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Cat is destroy");
    }
}
