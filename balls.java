package Sample1;

public class balls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 
		int B1=5;
		int B2=5;
		int B3=5;
		int B4=3;
		int B5=5;
		int B6=5;
		int B7=5;
		int B8=5;
		int B9=5;
		
		int A=B1+B2+B3;
		int b=B4+B5+B6;
		int c=B7+B8+B9;
		
		if(A==b) {
			
			System.out.println("Smaller is in the group of C");
			
			if(B7==B8) {
				
				System.out.println("Small is B9");
			}
			else if (B7<B8) {
				System.out.println("B7 is small");
			}
			else {
				System.out.println("B8 is small");
			}
			
		}
		else if (A<b){
			
			System.out.println("Smaller is in the group of A");
			
			if(B1<B2) {
				
				System.out.println("Small is B1");
			}
			else if (B2<B1){
				System.out.println("Small is B2");
			}
			else {
				System.out.println("Small is B3");
			}
			
		}
		else {
			System.out.println("Smaller is in the group of b");
		
		
			if (B4<B5) {
			
			System.out.println("Small is the B4");
			}
			else if (B5<B4) {
			System.out.println("Small is B5");
			}
			else {
			System.out.println("Small is B6");
			}
		}
		
	}
}
