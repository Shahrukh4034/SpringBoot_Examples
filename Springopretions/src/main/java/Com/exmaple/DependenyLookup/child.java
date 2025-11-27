package Com.exmaple.DependenyLookup;

public class child implements data{

	@Override
	public data Demo() {
		   data d1 = Demo();
		   return d1;
		
	}

	
}
