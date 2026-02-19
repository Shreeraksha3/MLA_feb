package com.test.fls;

public class Employee {
	public int id=101;
	private String name="Raksha";
	private String cmp="Mphasis";
	private transient int pin=650048;//exclude serializatio use transient 
	@Override
	public String toString()
	{
		return "Employee [id=" +id+", name=" +name;
	}
}
