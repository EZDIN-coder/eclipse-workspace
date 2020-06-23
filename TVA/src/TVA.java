import java.util.Scanner;

public class TVA {
	private static double prixHT;
	private double prixTTC;
	private double TVA;
	
	public TVA (double ht) {
		
		this.prixHT=ht;
		
	}
 public void affiche () {
	 
	double TVA=TVA (prixHT);
	
	System.out.println(" le prixHT = "+prixHT+"  le TVA est "+TVA);
 }
 public double TVA (double prixHT) {
	 double prixTTC = prixHT*1.2;
	 double TVA = prixTTC - prixHT;
	return TVA;
}
 
 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double prixHT=sc.nextDouble();
		TVA t1=new TVA(prixHT);
		t1.affiche();
		// TODO Auto-generated method stub

	}

}
