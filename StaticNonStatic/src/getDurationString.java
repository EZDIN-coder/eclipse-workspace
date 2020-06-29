import java.util.Scanner;

public class getDurationString {
	
	public int minute;
	public int second;
	public int heure;
	public int d;
	private Object mn;
	
	
	public void  conversion (int mn, int s ) {
		
		
		
		Scanner sc=new Scanner (System.in);
		
		if(mn >=0 && 0<= s && s<=59) {
			
			this.mn=mn;
			int h = mn/60;
			int mn1=mn%60;
			
			System.out.println("les parametres sont valides");
			System.out.println("la durée est "+h+" h" +mn1+" m" +s+" s");
		}else 
			System.out.println("Invalid Value");
		
		
		
		
		
		
	}
	public void  conversion1 (  ) {
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Donner la durée");
		int s=sc.nextInt();
		
         if( 0<= s ) {
			
			
			int h = s/3600;
			int mn1=s/60;
			int mn2=mn1%60;
			int s1=s%60;
			
			System.out.println("les parametres sont valides");
			System.out.println("la durée est "+h+" h" +mn2+" m" +s1+" s");
		}else 
			System.out.println("Invalid Value");
		
		
		
		
	}
			
	
		public static void main(String[] args) 
		
		{ 

			Scanner sc=new Scanner(System.in);
			System.out.println("Donner la durée");
			//int minutes=sc.nextInt();
			//int secondes=sc.nextInt();
			getDurationString dur=new getDurationString();
			dur.conversion1( );
			
			
			
		} 
	} 

	
	
	

	

