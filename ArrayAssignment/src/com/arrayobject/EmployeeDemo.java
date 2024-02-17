package com.arrayobject;
class Employee{
	private int id;
	private String name;
	private double salary;
	
	public Employee() {
		super();
	}

	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
public class EmployeeDemo {
	static void displayEmployeeDetails(Employee[] emp) {
		for(Employee e:emp) {
			System.out.println(e);
		}
	}
	static void compareSalary(Employee[] emp) {
		for(int i=0;i<emp.length;i++) {
			for(int j=i+1;j<emp.length;j++) {
				if(emp[i].getSalary()==emp[j].getSalary()) {
					System.out.println(emp[i].getName()+" and "+emp[j].getName()+" have the same salary");
				}
			}
		}
	}
	public static void main(String[] args) {
		Employee[] emp=new Employee[3];
		
		emp[0]=new Employee(101, "Raj", 20000);
		emp[1]=new Employee(102, "Kavya", 35000);
		emp[2]=new Employee(103, "Mohit", 20000);
		displayEmployeeDetails(emp);
		System.out.println("------------------------");
		compareSalary(emp);
	}
}
