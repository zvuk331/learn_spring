package org.example.lesson3.hibernate.test1;

import org.example.lesson3.hibernate.test1.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Update {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();


            session.beginTransaction();

//            Employee employee = session.get(Employee.class, 1L);
//            employee.setSalary(2000);                                    // Изменение данных в БД
            session.createQuery("update Employee set salary=1000 where name='Sergey'").executeUpdate();

            session.getTransaction().commit();

        } finally {
            factory.close();
        }

    }
}
