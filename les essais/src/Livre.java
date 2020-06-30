
public class Livre {
 
private int NbPages;
private String titre;
 
public Livre(int nbPage, String title){
 
this.NbPages = nbPage;
this.titre = title;
}
 
public void setTitre(String title){
this.titre = title;
}
 
public void setNbPages(int nbPages){
this.NbPages = nbPages;
}
 
public void getNbPages(){
    System.out.println("nbre de page "+NbPages);
}
 
public void getTitre(){
    System.out.println("le titre est  "+titre);
}
 

 

 
public static void main(String[] args){
 
   Livre l1 = new Livre(300,"Harry potter");
   l1.setNbPages(500); // Changera les nombre de pages a 350
   l1.getNbPages(); // Affichera 350 dans la console
   l1.getTitre(); // Affichera Harry Potter
   l1.setTitre("hkjhhuj"); // Affichera Harry Potter
   l1.getTitre(); // Affichera Harry Potter
 }
}
