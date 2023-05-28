package Sample1;

public class Logical_Programs 
{
	public static void main(String[] args)
	{    
		// TODO Auto-generated method stub

		int no=7;
		int count=0;
		for(int i=1; i<=no; i++) {
			if(no%i==0) {
				count=count+1;
			}
		}
		
		if(count==2) {
			System.out.println("prime no");
		}
		else {
			System.out.println("number is not prime no");
		}
		
		
	}
}
