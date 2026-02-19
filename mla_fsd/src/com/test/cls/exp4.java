package com.test.cls;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;
public class exp4 {
	public static void main(String args[])
	
	
	{
		//Treemap - sorted order ,no null values, it will throw exception
		//TreeMap<String, Integer> data=new TreeMap<>();
//		Zen : 500//this is first because first letter is capitalized (ascii value)
//		apple : 350
//		dell : 400
//		lenovo : 320
//		sony : 5050
//		5050

		
		//output no order
		HashMap<String, Integer> data=new HashMap<>();//out:null : 11
//		apple : 350
//		sony : 5050
//		lenovo : 320
//		dell : 400
//		5050
		
		
		//output is in inserted order, synchronization
		//LinkedHashMap<String, Integer> data=new LinkedHashMap<>();
		data.put("sony", 330);
		data.put("lenovo", 320);
		data.put("dell", 230);
		data.put("sony", 5050);
		data.put("apple", 350);
		data.put("dell", 400);
		data.put("Zen",500);
		data.put(null, 11);//remove this in treemap, because nulll value not allowed in treemap
		//out: sony : 5050
//		lenovo : 320
//		dell : 400
//		apple : 350
//		null : 11
//		5050

		//if we add more null, it willlc onsider only one as null
		data.forEach((k,v)->System.out.println(k+" : "+v));;
		System.out.println(data.get("sony"));
	}
	
	
	
}
