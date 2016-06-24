package week9;

public class MareCursa {

	private Monopost[] masini;
	static int lungimeTraseu = 500;
	

	public MareCursa(Monopost[] masi){
		masini=masi;
	}
	
	public void startCursa(){
		for(Monopost curent : masini){
			curent.start();
		
		}
	}
}
