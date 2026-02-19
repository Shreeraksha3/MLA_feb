package com.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;



public class StoreData {
	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Transaction t=session.beginTransaction();
		Book obj=new Book();
		
		obj.setB_name("spring");
		obj.setB_author("kohli");
		obj.setB_price(6);
		session.persist(obj);
		Query<Book> q=session.createQuery("from Book");
		List<Book> list=q.list();
		for(Book b: list)
		{
			System.out.println(b.getId()+" "+b.getB_name()+ " "+b.getB_author()+ " "+b.getB_price());
		}
		//t.commit();
//		Book dt=session.get(Book.class, 1);
//		System.out.println(dt.getId()+" "+dt.getB_name()+" "+dt.getB_author()+" "+dt.getB_price());
//		dt.setB_name("HTML");
//		dt.setB_author("Raksha");
//		dt.setB_price(11);
//		//session.persist(dt);
		//session.remove(dt);
		t.commit();
		System.out.println("Done.");
	}
}
