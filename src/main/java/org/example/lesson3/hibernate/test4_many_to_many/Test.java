package org.example.lesson3.hibernate.test4_many_to_many;

import org.example.lesson3.hibernate.test4_many_to_many.entity.Child;
import org.example.lesson3.hibernate.test4_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory  factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;
        try {
//            session = factory.getCurrentSession();
//            Section football = new Section("Football");
//
//            Child child1 = new Child("Denis",10);
//            Child child2 = new Child("Pasha",11);
//            Child child3 = new Child("Alem",12);
//            Child child4 = new Child("Sergey",12);
//            Child child5 = new Child("Oleg",9);
//            Child child6 = new Child("Inna",8);
//
//            football.addChildToSection(child1);
//            football.addChildToSection(child2);
//            football.addChildToSection(child3);
//            football.addChildToSection(child4);
//            football.addChildToSection(child5);
//            football.addChildToSection(child6);
//
//            session.beginTransaction();
//
//            session.save(football);
//
//
//            session.getTransaction().commit();
//
//            System.out.println("Done!!!");

            //**************************************************************************


//            session = factory.getCurrentSession();
//            Section baseball = new Section("Baseball");
//            Section hockey = new Section("Hockey");
//            Section box = new Section("Box");
//
//            Child child1 = new Child("Igor",11);
//
//            child1.addSectionToChild(baseball);
//            child1.addSectionToChild(box);
//            child1.addSectionToChild(hockey);
//
//            session.beginTransaction();
//
//            session.save(child1);
//
//
//            session.getTransaction().commit();
//
//            System.out.println("Done!!!");

            //**************************************************************************

            session = factory.getCurrentSession();


            session.beginTransaction();

//            Section section = session.get(Section.class, 1);
            Child child = session.get(Child.class, 7);
            System.out.println(child);
            System.out.println(child.getSections());


            session.getTransaction().commit();

            System.out.println("Done!!!");
        }
        finally{
            session.close();
            factory.close();
        }
    }

}
