package one-to-one;

import one_to_one.entity.Detail;
import one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OneToOne {
    public static void main(String[] args) throws IOException {
        SessionFactory sessionFactory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Employee name: ");
            String name = reader.readLine();
            System.out.print("Employee surname: ");
            String surname = reader.readLine();
            System.out.print("Employee department: ");
            String department = reader.readLine();
            System.out.print("Employee salary: ");
            int salary;
            try {
                salary = Integer.parseInt(reader.readLine());
            } catch (Exception e) {
                System.out.println("Wrong input");
                salary = Integer.parseInt(reader.readLine());
            }
            System.out.print("Employee city: ");
            String city = reader.readLine();
            System.out.print("Employee phone: ");
            String phoneNumber = reader.readLine();
            System.out.print("Employee mail: ");
            String mail = reader.readLine();
            session = sessionFactory.getCurrentSession();
            Employee employee = new Employee(name, surname, department, salary);
            Detail detail = new Detail(city, phoneNumber, mail);
            employee.setDetail(detail);
            detail.setEmployee(employee);
            session.beginTransaction();
            session.save(employee);
            int id = employee.getId();
            Employee employee1 = session.get(Employee.class, id);
            session.getTransaction().commit();
            System.out.println("An employee was saved: " + employee1);
        } finally {
            session.close();
            sessionFactory.close();
        }
    }
}
