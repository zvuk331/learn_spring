package org.example.lesson3.hibernate.test1;

import org.example.lesson3.hibernate.test1.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Select {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();


            session.beginTransaction();

//            Employee emp = session.get(Employee.class, 1L); // Получение работника по ID

//            List<Employee> employees = session.createQuery("from Employee").getResultList(); // Получение всех записей из БД

            List<Employee> employees = session.createQuery("from Employee where name='Pavel' AND salary>400").getResultList(); // Получение пользователей по имени Pavel
            employees.forEach(System.out::println);


            session.getTransaction().commit();
//            System.out.println(emp);

        } finally {
            factory.close();
        }

    }
}
