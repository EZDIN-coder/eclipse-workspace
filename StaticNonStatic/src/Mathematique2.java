
public class Mathematique2 {

	int a, b;
	
	//public Mathematique2(int i,int j) {
		
	//}
	public int mini (int a, int b) {
	
		if(a<b) return a;
		else return b;
}
	
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mathematique2 m1 = new Mathematique2();
		int result = m1.mini(15, 9);
		System.out.println("Le minimum est : "+result);
		
	
		
	}

}
