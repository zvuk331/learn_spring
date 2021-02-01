package org.example.lesson3.hibernate.test1;

import org.example.lesson3.hibernate.test1.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Save {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();

            Employee emp = new Employee("Sergey", "Bogatirev", "SMM", 400);

            session.beginTransaction();
            session.save(emp);
            session.getTransaction().commit();
            System.out.println(emp);

        } finally {
            factory.close();
        }

    }
}
