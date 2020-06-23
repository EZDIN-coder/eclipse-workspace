 
public class Employe {
	
    private String nom;
    private double salaireBrute ;
   
    public Employe(String n, double sb) {
    	this.nom =n;
    	this.salaireBrute =sb;
    	
    	
    	
    }
    public void affiche () {
   
    	double salaireNet =salaireNet(salaireBrute);
    
    	System.out.println("Vous vous appelez "+nom+" et votre salaire Net est " + salaireNet);
    
    }
	public double salaireNet(double salaireBrute) {
		double retenues = salaireBrute *0.2;
		double salaireNet = salaireBrute - retenues;
		
		return salaireNet ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
         */
		Employe em1 = new Employe ("Thierry" , 4000);
		Employe em2 = new Employe ("Ezdin" , 5000);
		Employe em3 = new Employe ("rami" , 6000);
		em1.affiche();
		em2.affiche();
		em3.affiche();
//		 System.out.println ("votre salaire net est : "+em.salaireNet(5000));
//       String nom = "Anouchka"; //ici je declare et  j'initialise mes variables
//       double salaireBrute=4000;
//        double taux=20;
 //      double retenues= salaireBrute*0.2;
 //       double salaireNet = salaireBrute - retenues;
//       System.out.println("votre nom est "+nom+" vous gagnez "+salaireBrute);
      // System.out.println("Votre salaireNet "+salaireNet);
//     
//		Scanner sc = new Scanner(System.in);//on active le clavier
//		System.out.println("Saisissez un nom");
//       String nom = sc.nextLine();
//       System.out.println("Vous avez saisie " +nom);
//       System.out.println("Salaire brute est "+salaireBrute);
//       
//       System.out.println("Votre nom est " +nom+" vous gagnez " +salaireBrute);
//       System.out.println("Votre salaire net est  " +salaireNet);
//            
//       
//   
	}

}
