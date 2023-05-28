package Sample1;

public class PrimeNo
{
	//  Auto-generated method stub

	public static void main(String[] args) 
	{
		int no=20;
		int count=0;
		for(int i=1; i<=no; i++) 
		{
			if(no%i==0) 
		{
				count=count+1;
		}
		}
		
		if(count==2) 
		{
			System.out.println("prime no");
		}
		else 
		{
			System.out.println("number is not prime no");
		}
		

	}}
