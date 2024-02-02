package com.oops.covarientreturntype;
class Person{
	int id;
	String name;
	Person(){
		
	}
	Person(int id,String name){
		this.id=id;
		this.name=name;
	}
	Person showDetails() {
		name=name+"India";
		return this;
	}
}class Employee extends Person{
	float salary;
	Employee(){
		
	}
	Employee(int id,String name,float salary){
		super(id,name);
		this.salary=salary;
	}
//	Person showDetails() {
//		name=name+"ThinkQ";
//		salary=salary+1000;
//		return this;
//	}
	Employee showDetails() {
		name=name+"ThinkQ";
		salary=salary+1000;
		return this;
	}
}
public class CovarientDemo {
	public static void main(String[] args) {
		Person p1=new Person(1,"Rohit");
		System.out.println(p1.id+" "+p1.name);
		
		Person p;
		Employee e;
		p=new Employee(2,"Radha",4000f);
//		System.out.println(p.id+" "+p.name+" "+p.salary);
		
		Employee e1=new Employee(2, "dhanush", 20000f);
//		e=(Employee) e1.showDetails();	casting required
		
		//after changing datatype in subclass
		
		e=e1.showDetails();		//casting not required
		System.out.println(e.id+" "+e.name+" "+e.salary);
	}
}
