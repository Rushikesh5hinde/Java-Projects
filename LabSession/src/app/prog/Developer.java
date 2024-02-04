package app.prog;

public class Developer {
	private String devName;
	private double devExp;
	private String skills;
	
	public Developer() {
		super();
	}
	public Developer(String devName, double devExp, String skills) {
		super();
		this.devName = devName;
		this.devExp = devExp;
		this.skills = skills;
	}

	public void debugApp() {
		System.out.println("Debug is in use");
	}
	public void integrateCode() {
		System.out.println("Integration done!");
	}
	public String getDevName() {
		return devName;
	}
	public void setDevName(String devName) {
		this.devName = devName;
	}
	public double getDevExp() {
		return devExp;
	}
	public void setDevExp(double devExp) {
		this.devExp = devExp;
	}
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public String toString() {
		return "Developer:"+devName+" "+devExp+" "+skills;
	}
}
