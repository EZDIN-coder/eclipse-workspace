import java.util.Scanner;

public class racine {
	private static  double nombre ;
	private double racine;
public racine (double nm) {
		
		this.nombre= nm;
		
	}
   public void affiche () {
	   
	
   double racine = racine(nombre);
	System.out.println("Le racine carrée est"+racine);
   }
	
	public double racine (double nombre) {
		 double racine=Math.sqrt(nombre);
		return racine;
	}


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double nombre =sc.nextDouble();
		racine r1=new racine (nombre);
		r1.affiche();
		// TODO Auto-generated method stub
	

	}

}
