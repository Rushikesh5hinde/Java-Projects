package app.prog;

public class Application {
	protected double version;
	protected String technology;
	private Developer developer;
	
	public Application() {
		
	}
	public Application(double version,String technology,Developer developer) {
		this.version=version;
		this.technology=technology;
		this.developer=developer;
	}
	
	public double getVersion() {
		return version;
	}
	public void setVersion(double version) {
		this.version = version;
	}
	public String getTechnology() {
		return technology;
	}
	public void setTechnology(String technology) {
		this.technology = technology;
	}
	public Developer getDeveloper() {
		return developer;
	}
	public void setDeveloper(Developer developer) {
		this.developer = developer;
	}
	public void install() {
		System.out.println("installation done!");
	}
	public void uninstall() {
		System.out.println("uninstallation done!");
	}
	public String toString() {
		return "Application:"+version+" "+technology+" "+developer;
	}
}
