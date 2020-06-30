
public class Personne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		  // int [] tab = new int[6]; // déclaration du tableau
		   //int [] tab = {10,25,63,2,18};
		   String [] fruits = {"Pomme","Fraise","Framboise"};
		   float [] tab = new float [6];
		   int taille = tab.length; // la taille de mon tableau 
		   //int valeur = tab[0]; // je recupère le premier element
		   
		   String nomfruit1 = fruits[0];
		   String nomfruit2 = fruits[1];
		   
		   System.out.println(taille);
		  // System.out.println(valeur);
		   
		   
		   System.out.println(nomfruit1);
		   System.out.println(nomfruit2);
		   
		   
		   for(int i=0; i<tab.length;i++) { // Ici c'est pour ajouter les valeurs à notre tableau
			   
			   tab[i] = i+2 ;
			   
		   }
		   
		   for(int i=0; i<fruits.length; i++) {
			   
			   System.out.println(fruits[i]);
			   
		   }
		   
		   
		   
	}

}
