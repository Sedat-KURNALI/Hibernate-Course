package com.hb04.bi_onetoone;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch04 {

	public static void main(String[] args) {
		Configuration con=new Configuration().configure("hibernate.cfg.xml").
				addAnnotatedClass(Student04.class).addAnnotatedClass(Diary02.class);
		
		SessionFactory sf= con.buildSessionFactory();
		Session session= sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		//student fetch ediyoruz bir id ile
//	    Student04 student = session.get(Student04.class, 1001);
	    
	    //diary fetch ediyoruz
//	    Diary02 diary= session.get(Diary02.class, 101);
//	    
//	    System.out.println(student);
//	    System.out.println("------------------------");
//	    System.out.println(student.getDiary());
//	    System.out.println("------------------------");
//	    System.out.println(diary);
//	    System.out.println("------------------------");
//	    System.out.println(diary.getStudent());
//	    System.out.println("------------------------");

		String hqlQuery1 = "SELECT s.name,d.name FROM Student04 s INNER JOIN FETCH Diary02 d on s.id=d.student";
		List<Object[]> resultList1 = session.createQuery(hqlQuery1).getResultList();

//		for (Object[] objects : resultList1) {
//			System.out.println(Arrays.toString(objects));
//		}
		
		resultList1.forEach(oa->{
			System.out.println(Arrays.toString(oa));
		});

		
		tx.commit();
		session.close();
        sf.close();
	}

}
