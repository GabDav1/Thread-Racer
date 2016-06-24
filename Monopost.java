package week9;

public class Monopost extends Thread {

	private int viteza;
	private int modificator;
	private int distantaParcursa;
	private boolean flag1, flag2;
	private boolean castigator;
	
	public int getViteza() {
		return viteza;
	}


	public void setViteza(int viteza) {
		this.viteza = viteza;
	}


	public Monopost(String name){
		this.setName(name);
		this.setViteza(20);
		flag1 = true;
		flag2 = true;
	}
	
	@Override
	public void run() {
		distantaParcursa = 0;
		while(distantaParcursa<MareCursa.lungimeTraseu){
			
			if(distantaParcursa>MareCursa.lungimeTraseu-MareCursa.lungimeTraseu / 5 && flag1){
				System.out.println("\n"+this.getName()+" has nearly finished the race!!!!"+"\n");
				flag1=false;
			}else if(distantaParcursa>MareCursa.lungimeTraseu-MareCursa.lungimeTraseu/2 && flag2){
				System.out.println("\n"+this.getName()+" has less then half of the way to go!!!!"+"\n");
				flag2=false;
			}
			
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				System.out.println("cannot sleep");
			}
			distantaParcursa += viteza;
			this.schimbaViteza();
			System.out.println("\n"+this.getName()+" has progressed by"+
			this.getViteza()+" , totalling a distance of"+distantaParcursa);
			System.out.println("==============================================");
		}
		System.out.println("\n"+this.getName()+" has passed the finish line !!!"+"\n");
	}


	private void schimbaViteza() {

		modificator = (int)(Math.random()*4-1);

		this.setViteza(this.getViteza()+modificator);
	}
}
