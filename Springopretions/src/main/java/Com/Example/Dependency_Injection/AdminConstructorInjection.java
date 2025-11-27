package Com.Example.Dependency_Injection;

public class AdminConstructorInjection {
	
	private int id;
	private String name;
	
	
	/// Constructor injection for each varibale
	public AdminConstructorInjection(int id) {
		super();
		this.id = id;
	}
	public AdminConstructorInjection(String name) {
		super();
		this.name = name;
	}
	

}
