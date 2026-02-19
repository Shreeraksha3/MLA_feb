package com.test;
@FunctionalInterface
interface FunInf
{
	void draw();
	//void color();cannot use more than one abstract class inside he interface
	default void dog() {
		
	}
	static void cat() {
		
	}
}
class Circle implements FunInf
{
	@Override
	public void draw()
	{
		System.out.println("circle");
	}
}
class Square implements FunInf
{
	@Override
	public void draw()
	{
		System.out.println("square");
	}
	//factory method
	public Square getObj()
	{
		System.out.println("object created/returned");
		return new Square();
	}
}
public class Exp2 {
	public static void main(String[] args)
	{
		FunInf obj1=new Circle();//one time memory allocation(dynamic binding)
		//Circle obj1=new Circle();// 2 time memory allocation
		obj1.draw();
		
		Square obj2=new Square();
		
		obj2.draw();
		
		Square obj3=obj2.getObj();//factory method we are suing the same object for the another object
		
		//lambda expression=one line implementaton of polymorphism=no need method name , it uses method signature ()
		FunInf obj4 =()->System.out.println("circle");
		obj4.draw();
	}
}
