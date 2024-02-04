package com.innerclass;
class LifeStyleMall{
	protected static String mallName;
	protected static String location;
	protected int custid;
	protected String custname;
	protected long mobileNo;
	static {
		mallName="LifeStyle";
		location="Pune";
	}
	
	public LifeStyleMall() {
		
	}

	public LifeStyleMall(int custid, String custname, long mobileNo) {
		
		this.custid = custid;
		this.custname = custname;
		this.mobileNo = mobileNo;
	}


	class AnnualPayCard{
		protected int cardid;
		protected String expiryDate;
		protected double balance;
		public AnnualPayCard() {
			
		}
		public AnnualPayCard(int cardid, String expiryDate, double balance) {
			
			this.cardid = cardid;
			this.expiryDate = expiryDate;
			this.balance = balance;
		}
		public void showDetails() {
			System.out.println("Mall Name:"+mallName);
			System.out.println("Location:"+location);
			
			System.out.println("---------------------");
			System.out.println("Customer id:"+custid);
			System.out.println("Customer Name:"+custname);
			System.out.println("Mobile:"+mobileNo);
			System.out.println("----------------------");
			System.out.println("Card id:"+cardid);
			System.out.println("Expiry Date:"+expiryDate);
			System.out.println("Balance:"+balance);
		}
		
	}
}
public class MallTest {
	public static void main(String[] args) {
		LifeStyleMall cust1=new LifeStyleMall(101, "Ruhi", 12345);
		
		LifeStyleMall.AnnualPayCard card1=cust1.new AnnualPayCard(1, "23-jan-29", 10000);
		card1.showDetails();
	}
}
