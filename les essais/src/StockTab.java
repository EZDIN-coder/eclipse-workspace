import java.util.Scanner;

public class StockTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [] tab = new int[6];
		 int taille = tab.length;
		
		 for(int i=0; i<tab.length; i++) {
			   
			   System.out.println("Donner le premier nombre");
			  Scanner sc = new Scanner(System.in);
			   int nmbr1 = sc.nextInt();
			   
			   tab[0] =nmbr1;
			   
			   System.out.println("Donner le second nombre");
			 Scanner sc1 = new Scanner(System.in);
			 int nmbr2 = sc.nextInt();
			 tab[1]=nmbr2;
			 
			System.out.println("Donner le troixieme nombre");
					  Scanner sc2 = new Scanner(System.in);
					   int nmbr3 = sc.nextInt();
					   tab[2]=nmbr3;
					   System.out.println("Donner le quaterieme nombre");
						  Scanner sc3 = new Scanner(System.in);
						   int nmbr4 = sc.nextInt();
						   tab[3]=nmbr4;
						   System.out.println("Donner le cinquieme nombre");
							  Scanner sc4 = new Scanner(System.in);
							   int nmbr5 = sc.nextInt();
							   tab[4] =nmbr5;
							   System.out.println("Donner le sixieme nombre");
								  Scanner sc5 = new Scanner(System.in);
								   int nmbr6 = sc.nextInt();
								   tab[5]=nmbr6;
								   
								   System.out.println(tab[i]);
		   }
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
