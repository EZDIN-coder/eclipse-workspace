import java.util.Scanner;


public class AppJava {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quel age avez vous?");
		int age= sc.nextInt();
		if(age<18) {
			System.out.println("Vous ne pouvez pas voter");
		}
			
			else {
				System.out.println("Vous pouvez voter");
			}
		}

	}


