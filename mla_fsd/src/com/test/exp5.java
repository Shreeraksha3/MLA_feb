package com.test;
//unknownException
public class exp5 {
	public static void main(String[] args)
	{
		try
		{
			System.out.println(10/0);
		}
		catch(Exception e)
		{	//getMessage()
			System.out.println(e.getMessage());//output: "/ by zero"
			
			//printing exception class object
			System.out.println(e);//out: "java.lang.ArithmeticException: / by zero"
			//printStackTrace();
			e.printStackTrace();//out: java.lang.ArithmeticException: / by zero at com.test.exp5.main(exp5.java:8)

		}
	}
}
