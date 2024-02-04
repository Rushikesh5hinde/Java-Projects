package app.prog;

import app.mob.MobileApplication;

public class AppTest {
	public static void main(String[] args) {
		Developer d1=new Developer("Rushi", 3, "Java Development");
		
		DesktopApplication desk1=new DesktopApplication(1.1, "Spring", d1, 101);
		System.out.println(desk1);
		
		WebApplication web1=new WebApplication(1.1, "React", d1, 1234);
		System.out.println(web1);
		
		MobileApplication m1=new MobileApplication(5.6, "Android", d1, 112233445l);
		System.out.println(m1);
	}
}
