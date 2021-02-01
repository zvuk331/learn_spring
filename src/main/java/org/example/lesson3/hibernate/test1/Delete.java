package org.example.lesson3.hibernate.test1;

import org.example.lesson3.hibernate.test1.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Delete {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();


            session.beginTransaction();

            /*Employee employee = session.get(Employee.class, 2L);
            session.delete(employee);*/                                     // Удаление из БД


            session.createQuery("delete Employee where name='Alem'").executeUpdate();

            session.getTransaction().commit();

        } finally {
            factory.close();
        }

    }
}
