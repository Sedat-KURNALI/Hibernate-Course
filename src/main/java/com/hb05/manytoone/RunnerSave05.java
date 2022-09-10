package com.hb05.manytoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class RunnerSave05 {

	public static void main(String[] args) {

		Student05 student1 = new Student05();
		student1.setId(1001);
		student1.setName("John Coffee");
		student1.setGrade(10);

		Student05 student2 = new Student05();
		student2.setId(1002);
		student2.setName("James Bond");
		student2.setGrade(11);

		Student05 student3 = new Student05();
		student3.setId(1003);
		student3.setName("Tony Stark");
		student3.setGrade(9);

		University university1 = new University();
		university1.setId(1);
		university1.setName("TPE Tech");

		University university2 = new University();
		university2.setId(2);
		university2.setName("Sdt Tech");

		University university3 = new University();
		university3.setId(3);
		university3.setName("rcp Tech");

		student1.setUniversity(university1);
		student2.setUniversity(university2);
		student3.setUniversity(university3);

		Configuration con = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student05.class)
				.addAnnotatedClass(University.class);

		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();

		Transaction tx = session.beginTransaction();

		session.save(university1);
		session.save(university2);
		session.save(university3);

		session.save(student1);
		session.save(student2);
		session.save(student3);

		tx.commit();
		session.close();
		sf.close();

	}

}
