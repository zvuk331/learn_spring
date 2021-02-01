package org.example.lesson3.hibernate.test3_one_to_many;

import org.example.lesson3.hibernate.test3_one_to_many.entity.Department;
import org.example.lesson3.hibernate.test3_one_to_many.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;
        try {
            session = factory.getCurrentSession();

            Department department = new Department("YouTube", 700,1900);
            Employee emp1 = new Employee("Alem", "Abuov",700);
            Employee emp2 = new Employee("Denis", "Kovalevskiy",900);

            department.addEmployeeToDepartment(emp1);
            department.addEmployeeToDepartment(emp2);
            session.beginTransaction();

//            Department department = session.get(Department.class, 5);

            session.save(department);

            session.getTransaction().commit();
            System.out.println("Done!");

        } finally {
            session.close();
            factory.close();
        }

    }
}
