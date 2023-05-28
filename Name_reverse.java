package Sample1;

public class Name_reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="ankit";
		
		String b="";
		
		int c=a.length();
		System.out.println(c);
		
		for(int i=a.length()-1;i>=0;i--) {
			
			b=b+a.charAt(i);	
		}
		System.out.println(b);

	}

}
