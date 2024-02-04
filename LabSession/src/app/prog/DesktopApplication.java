package app.prog;

public class DesktopApplication extends Application{
	protected int did;
	
	public DesktopApplication() {
		
	}
	public DesktopApplication(double version,String technology,Developer developer,int did) {
		super(version,technology,developer);
		this.did=did;
	}
	public String toString() {
		return "Desktop App:"+did+" "+super.toString();
	}
}
