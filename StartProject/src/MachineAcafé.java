
public class MachineAcaf� {

	private int nomCapsule;
	private int taillecaf�;
	private int quantit�Deau;
	
	
	public MachineAcaf�(int nomCapsule2,int tailleCafe2,int qe) {
		this.nomCapsule=nomCapsule2;
		this.taillecaf�=tailleCafe2;
		this.quantit�Deau=qe;
	}
	
	//Ici c'est la fonction qui affiche le type de caf� choisi: vert,jaune...etc
	
	

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
		  double eauRestanteC = quantit�Deau - 0.01;
		  double eauRestanteL = quantit�Deau - 0.05;
		  if(quantit�Deau==1) {
		  switch (taillecaf�) {
			
		  case 1 :
				System.out.println("Vous avez choisi le court");
				typeCafe();
				System.out.println("la quantit� d'eau restante est : "+eauRestanteC);
				break;
				
			case 2 :
				System.out.println("Vous avez choisi long");
				typeCafe();
				System.out.println("la quantit� d'eau restante est : "+eauRestanteL);
				break;
				
			default :
				System.out.println("Mauvais choix");
		  }
		} else System.out.println("Ajouter de l'eau");
		  
	  }
}
