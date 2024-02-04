package app.mob;
class A{
	int id;
	A(int id){
		this.id=id;
	}
}
class B extends A{
	String name;
	
	B(int id,String name){
		super(id);
		this.name=name;
	}
}
public class DemoCoupling {

}
