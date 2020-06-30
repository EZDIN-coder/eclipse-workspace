
public class tab2Dimensin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] [] tab = new int [6] [5] ;
		
		for(int i=0;i<tab.length;i++) {
			
			for(int j=0; j<tab[i].length;j++) {
				
				tab[i][j] = i+j;
				
				System.out.println(tab[i][j]);
				
			}
			
			
		}
		
		
		}

}
