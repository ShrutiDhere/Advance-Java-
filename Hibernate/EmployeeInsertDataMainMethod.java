package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Employee;



public class EmployeeInsertDataMainMethod {

	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		
		Employee e = new Employee();
		e.setName("sonali");
		e.setCity("solapur");
		e.setEmail("sonali@1234gmail.com");
		
		ss.persist(e);
		tr.commit();
		ss.close();
		
		System.out.println("Employee Data is Inserted Sucessfully");
		
	}
}
