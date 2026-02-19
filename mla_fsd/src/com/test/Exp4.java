package com.test;

public class Exp4 {
	public static void main(String[] args) {
		//System.out.println("MLA");
		//System.out.println(11/12);
		//System.out.println(11/0); java.lang.ArithmeticException: / by zero
		//System.out.println("CODERS");
		//String name=null;
		//System.out.println(name.charAt(1));// java.lang.NullPointerException: Cannot invoke "String.charAt(int)" because "name" is null
		//int[] arr= {2,4,5,6,6};
		//System.out.println(arr[5]);//java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
		//int x=Integer.parseInt("22a3");// java.lang.NumberFormatException: For input string: "22a3"
		
		//compile time exception- WE SHOULD USE TRY CATCH
		//Class.forName("");
		
		//exception handling
		try {
			System.out.println(11/0);
			String name=null;
			System.out.println(name.equals("test"));
		}
		catch(ArithmeticException ae)//child
		{
			System.out.println("cant divided by zero");
			System.exit(0);//t will not go to the finally lock
			return;//if we write this from here it will continue to next
		}
		catch(NullPointerException npe)//child
		{
			System.out.println("Enter a value for string");
		}
		catch(StringIndexOutOfBoundsException ste)//child
		{
			System.out.println("Check string length");
		}
		catch(NumberFormatException ne)//child
		{
			System.out.println("check array length");
		}
		catch(Exception e)//parent
		{
			System.out.println("try again");
		}
		finally {
			System.out.println("finally block");
		}
	}
}
