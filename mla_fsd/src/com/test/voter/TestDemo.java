package com.test.voter;
import java.util.Scanner;
public class TestDemo {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		DataValidator obj=new DataValidator();
		obj.checkAge(age);
	}
}
//output: Enter your age
//21
//Exception in thread "main" com.test.voter.AgeValidationException: Valid
//	at com.test.voter.DataValidator.checkAge(DataValidator.java:8)
//	at com.test.voter.TestDemo.main(TestDemo.java:10)
