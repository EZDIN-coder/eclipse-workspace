
public class MachineAcafé {

	private int nomCapsule;
	private int taillecafé;
	private int quantitéDeau;
	
	
	public MachineAcafé(int nomCapsule2,int tailleCafe2,int qe) {
		this.nomCapsule=nomCapsule2;
		this.taillecafé=tailleCafe2;
		this.quantitéDeau=qe;
	}
	
	//Ici c'est la fonction qui affiche le type de café choisi: vert,jaune...etc
	
	

	public void typeCafe() {
		switch (nomCapsule) {
		case 1 :
			System.out.println("Vous avez choisi le vert");
			break;
			
		case 2 :
			System.out.println("Vous avez choisi le jaune");
			break;
			
		default :
			System.out.println("Mauvais choix");
		
	}
	
		}
	
	  public void choixTailleCafe() {
		  double eauRestanteC = quantitéDeau - 0.01;
		  double eauRestanteL = quantitéDeau - 0.05;
		  if(quantitéDeau==1) {
		  switch (taillecafé) {
			
		  case 1 :
				System.out.println("Vous avez choisi le court");
				typeCafe();
				System.out.println("la quantité d'eau restante est : "+eauRestanteC);
				break;
				
			case 2 :
				System.out.println("Vous avez choisi long");
				typeCafe();
				System.out.println("la quantité d'eau restante est : "+eauRestanteL);
				break;
				
			default :
				System.out.println("Mauvais choix");
		  }
		} else System.out.println("Ajouter de l'eau");
		  
	  }
}
