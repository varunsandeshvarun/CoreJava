package com.app.constructor;

public class Test { 
	
	private int id;
	private String name;
	private Double sal;
	private String place;
	
	public Test(int id,String name,Double sal,String place){
		this.id=id;
		this.name=name;
		this.sal=sal;
		this.place=place;
	}
@Override
	public String toString() {
		return "Test [id=" + id + ", name=" + name + ", sal=" + sal + ", place=" + place + "]";
	}
public static void main(String[] args) {
	Test t= new Test(10,"madhu",100.0,"hyd");
	System.out.println("hii ..Happy Diwali");
}
}
