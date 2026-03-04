package com.test;
class A {//extends B
	//B b=new B();
}
class B{//extends A
	B a=new B();
}
public class CirculPrblm {
public static void main(String[] args) {
	System.out.println("main");
}
}
