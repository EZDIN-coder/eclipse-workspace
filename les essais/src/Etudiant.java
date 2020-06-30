import java.util.Scanner;

public class Etudiant {

	
	String nom;
	String prenom;
	String adresse;
	int age;
	static int departement;
	
	public void StringEtudiant(String m,String p,String ad,int age,int de) {
		
		this.nom=m;
		this.prenom=p;
		this.adresse=ad;
		this.age=age;
		this.departement=de;
		
	}
	
	public static void affiche () {
		
		
		int de;
		System.out.println("Veullier saisir le numero du département");
		Scanner sc=new Scanner(System.in);
		  int de1 =  sc.nextInt(); 
		if ( de1 != 77) {
			
			System.out.println("Vous ne pouvez pas s'inscrire");
			
		}else {
			
			System.out.println("Votre nom ");
			Scanner sc1 = new Scanner(System.in);
			String m = sc1.nextLine();
			
			System.out.println("Votre prenom ");
			
			Scanner sc2=new Scanner(System.in);
			String p = sc2.nextLine();
			
			System.out.println("Votre age ");
			Scanner sc3=new Scanner(System.in);
			int age=sc3.nextInt();
			
			System.out.println("Votre adresse  ");
			Scanner sc4=new Scanner(System.in);
			String ad= sc4.nextLine();
			System.out.println("Votre nom est "+m+" votre prenom est "+p+" votre age est "+age+" votre adresse est " +ad);
		}
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
     Etudiant.affiche();
     
	
		
	}

}
