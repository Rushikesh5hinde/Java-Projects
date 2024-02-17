package com.arrayobject;
class Date{
	private int day;
	private String month;
	private int year;
	public Date() {
		super();
	}
	public Date(int day, String month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public String getMonth() {
		return month;
	}
	public void setMonth(String month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
}
class Dept{
	private int did;
	private String dname;
	public Dept() {
		super();
	}
	public Dept(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "Dept [did=" + did + ", dname=" + dname + "]";
	}
	
}
class Emp{
	private int id;
	private String name;
	private double salary;
	private Date date;
	private Dept dept;
	public Emp() {
		super();
		
	}
	public Emp(int id, String name, double salary, Date date,Dept dept) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.date = date;
		this.dept=dept;
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
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + ", date=" + date + ", dept=" + dept + "]";
	}
	
	
}
public class EmployeeDemo2 {
	static void displayEmpDetails(Emp[] emp) {
		for(Emp e:emp) {
			System.out.println(e);
		}
	}
	static void compareJoinDate(Emp[] emp) {
		for(int i=0;i<emp.length;i++) {
			for(int j=i+1;j<emp.length;j++) {
				if(emp[i].getDate().getDay()==emp[j].getDate().getDay() && emp[i].getDate().getYear()==emp[j].getDate().getYear() && emp[i].getDate().getMonth().equals(emp[j].getDate().getMonth())) {
					System.out.println(emp[i].getName()+" and "+emp[j].getName()+" have same joining date");
				}
			}
		}
	}
	static void compareDeptName(Emp[] emp) {
		for(int i=0;i<emp.length;i++) {
			for(int j=i+1;j<emp.length;j++) {
				if(emp[i].getDept().getDname().equals(emp[j].getDept().getDname())) {
					System.out.println(emp[i].getName()+" and "+emp[j].getName()+" have same dept name");
				}
			}
		}
	}
	public static void main(String[] args) {
		Emp[] e=new Emp[3];
		
		e[0]=new Emp(101, "Jatin", 40000, new Date(11, "Mar", 2010), new Dept(1, "HR"));
		e[1]=new Emp(102, "Rekha", 50000, new Date(23, "Apr", 2019), new Dept(1, "HR"));
		e[2]=new Emp(103, "Jack", 70000, new Date(11, "Mar", 2010), new Dept(2, "Development"));
		displayEmpDetails(e);
		System.out.println("------------------------------------------");
		compareDeptName(e);
		compareJoinDate(e);
	}
}
