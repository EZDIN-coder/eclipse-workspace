import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);

     System.out.println("Coisissez votre capsule : \n 1= ==>> vert \n 2= ==>> jaune \n");
             int nomCapsule = sc.nextInt();

             System.out.println("Coisissez votre taille de caf� : \n 1= ==>> long \n 2= ==>> court \n");
             int tailleCafe = sc.nextInt();

             System.out.println("Avez vous assez d'eau dans la machine : \n 1= ==>> oui \n 2= ==>> non\n");
             int reponse = sc.nextInt();
             System.out.println("Avez vous assez d'eau dans la machine : \n 1= ==>> oui \n 2= ==>> non\n");
             int quantit�Deau = sc.nextInt();
             
             MachineAcaf� m1 = new MachineAcaf� (nomCapsule, tailleCafe,quantit�Deau);
             m1.choixTailleCafe();


	}

}
