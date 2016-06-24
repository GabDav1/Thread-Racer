package week9;

public class AeroSmithDriver {

	public static void main(String[] args) {
	
		
		Monopost f1 = new Monopost("McClaren");
		Monopost f2 = new Monopost("Ferrari");
		Monopost f3 = new Monopost("Dacia");
		Monopost f4 = new Monopost("Honda");
		Monopost f5 = new Monopost("Tesla");
		
		Monopost[] monoposturi = {f1,f2,f3,f4,f5};
		
		MareCursa race = new MareCursa(200,monoposturi);
		
		race.startCursa();
		

	}

}
