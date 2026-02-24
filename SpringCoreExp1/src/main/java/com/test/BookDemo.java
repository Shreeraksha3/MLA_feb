package com.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class BookDemo {
	public static void main(String[] args) {
//		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");//Ioc container
//		Book b=(Book)ctx.getBean("bk");
//		System.out.println(b);
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AnnoConfig.class);
		BookDetails b1=ctx.getBean(BookDetails.class);
		Book b2=ctx.getBean(Book.class);
		b1.setPages(2200);
		b1.setPublisher("MLA");
		b1.setPyear(2026);
		
		List<BookDetails> list=new ArrayList<>();
		
		list.add(b1);
		
		b2.setId(201);
		b2.setName("spring notes");
		b2.setAuthor("Arjun");
		b2.setPrice(5);
		b2.setListbd(list);
		
		System.out.println(b2);
		
	}
}
