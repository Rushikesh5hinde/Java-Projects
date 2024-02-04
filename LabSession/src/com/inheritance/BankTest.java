package com.inheritance;
class Bank{
	private double principalAmt;
	protected double ir;
	
	public Bank() {
		super();
	}
	public Bank(double principalAmt,double ir) {
		this.principalAmt=principalAmt;
		this.ir=ir;
	}
	public void setPrincipalAmt(double principalAmt) {
		this.principalAmt=principalAmt;
	}
	public double getPrincipalAmt() {
		return principalAmt;
	}
	public void getInterestRate() {
		System.out.println("Interest Rate:"+ir);
	}
	public String toString() {
		return "Bank:"+principalAmt+" "+ir;
	}
}
class Saving extends Bank{
	private int accno;
	protected String ifsc;
	public Saving() {
		super();
	}
	public Saving(double principalAmt,double ir,int accno,String ifsc) {
		super(principalAmt,ir);
		this.accno=accno;
		this.ifsc=ifsc;
	}
	@Override
	public void getInterestRate() {
		
		System.out.println("Interest Rate:"+ir);
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	
}
class Current extends Bank{
	private int accno;
	private String ifsc;
	public Current() {
		super();
	}
	public Current(double principalAmt,double ir,int accno,String ifsc) {
		super(principalAmt,ir);
		this.accno=accno;
		this.ifsc=ifsc;
	}
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	@Override
	public void getInterestRate() {
		
		System.out.println("Interest Rate:"+ir);
	}
	
}
public class BankTest {
	public static void main(String[] args) {
		Bank b1=new Bank(7000,0.02);
		b1.getInterestRate();
		
		Saving s1=new Saving(10000, 0.03, 1234, "sbi123");
		s1.getInterestRate();
		
		Current c1=new Current(12000, 0.05, 44556, "idfc123");
		c1.getInterestRate();
	}
}
