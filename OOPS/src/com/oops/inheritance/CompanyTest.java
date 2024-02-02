package com.oops.inheritance;
class Company{
	private String gst;
	private String type;
	
	
	public Company() {
		
	}
	public Company(String gst,String type) {
		this.gst=gst;
		this.type=type;
	}
	public void setGst(String gst) {
		this.gst=gst;
		this.type=type;
	}
	public String getGst() {
		return gst;
	}
	public void setType(String type) {
		this.type=type;
	}
	public String getType() {
		return type;
	}
	public String toString() {
		return "Company:"+gst+" "+type;
	}
}
class PrivateCompany extends Company{
	private int emp_size;
	private String location;
	
	public PrivateCompany() {
		super();
	}
	public PrivateCompany(String gst,String type,int emp_size,String location) {
		super(gst,type);
		this.emp_size=emp_size;
		this.location=location;
	}
	public void SetEmp_Size(int emp_size) {
		this.emp_size=emp_size;
	}
	public int getEmp_Size() {
		return emp_size;
	}
	public void setLocation(String location) {
		this.location=location;
	}
	public String getLocation() {
		return location;
	}
	public String toString() {
		return "Private Company:"+emp_size+" "+location;
	}
}
public class CompanyTest {
	public static void main(String[] args) {
		PrivateCompany obj=new PrivateCompany("com123", "Private", 50, "Pune");
		System.out.println(obj);
	}
}
