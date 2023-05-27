package variables1;

public class ehsehi {

	public static void main(String[] args) {
		
		int a=1;
		int b=4;
		
		for(int i=1; i<=7; i++) {
			
			for(int j=1; j<=a; j++) {
				
				System.out.print(" ");
			}
			for(int k=1; k<=b; k++) {
				System.out.print("*");
			}
			System.out.println();
			a--;
			b++;
		}
	}
	
	
}
