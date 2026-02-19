package com.test;

import java.util.List;

public class Test {
	public static void main(String args[])
	{
		StuDao sdao=new StuDao();
		Student stu1=new Student();
		stu1.setUsn(2);
		stu1.setName("Nethra ");
		stu1.setMarks(99);
		stu1.setAddress("MITE");
		
		sdao.saveStudent(stu1);
		//sdao.updateStudent(stu1);
		System.out.println("Updated Student Data.");
		List<Student> sdata=sdao.getAllStudents();
		sdata.forEach(System.out::println);
		
	}
}
