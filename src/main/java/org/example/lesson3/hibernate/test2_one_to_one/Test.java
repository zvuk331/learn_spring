package org.example.lesson3.hibernate.test2_one_to_one;

import org.example.lesson3.hibernate.test2_one_to_one.entity.Details;
import org.example.lesson3.hibernate.test2_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Details.class)
                .buildSessionFactory();
        Session session = null;
        try {
            session = factory.getCurrentSession();

//            Employee employee = new Employee("Pavel", "Lissin","IT", 2000);
//            Details details = new Details("Stepnogorsk","87762653826","zvuk331@gmail.com");
//            employee.setDetails(details);

            ;
            session.beginTransaction();
            Employee employee = session.get(Employee.class, 1L);
            session.delete(employee);

//            session.save(employee);

            session.getTransaction().commit();

        } finally {
            session.close();
            factory.close();
        }

    }
}
