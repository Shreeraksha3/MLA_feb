package com.test.cls;

import java.util.HashSet;
import java.util.Iterator;
public class Exp3 {
	public static void main(String[] args)
	{
		
		HashSet data=new HashSet();
		//LinkedHashSet data=new LinkedHashSet();
		//TreeSet data=new TreeSet();
		data.add(200);
		data.add('a');
		data.add(33);
		
		data.add(200);
		data.add("java");
		data.add("test");
		data.add(33.3f);
		data.add(false);
		data.add("java");
		data.add(345l);
		System.out.println(data.size());
		System.out.println(data);
		/*
		Iterator itr=data.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		*/
		//above block is also give the same output as below
		data.forEach(System.out::println);//this is static so we are using ::
							
}
}