
public class voiture {
	private String nom ;
	private String marque;
	private String modele;
	private String couleur;
	private double vitesse;
	//private double distance;
	
	public voiture(String n, String ma,String mo,String co,double V) {
    	this.nom =n;
    	this.marque = ma;
    	this.modele = mo;
    	this.couleur = co;
    	this.vitesse =V;
    	//this.distance =di;
	}
	 public void affiche () {
		   
	    	   
			 
	    
			System.out.println("Vous roulez a "+vitesse+" Km/h et pour une distance de " + 100+"Km Vous mettez un temps de "+temps(this.vitesse)+" heures");
	    
	    }
	 public double temps(double vitesse) {
			
			double temps = 100/vitesse;
			
			return temps;
	 }
	 public static void main(String[] args) {
			// TODO Auto-generated method stub
			/*
	         */
			voiture V1 = new voiture ("Clio","Renault","classique","Noir", 120 );
			//voiture V2 = new Employe ("Ford" , 200);
			
			V1.affiche();
	

	}

}
