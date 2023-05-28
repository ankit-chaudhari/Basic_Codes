package Sample1;

public class Arrays_Equals_to
{
	public static void main(String[] args)
	{
		int[] ar1= {20,30,50};
		int[] ar2= {50,30,80};
		int[] ar3= {20,30,50};
		
		if(ar1==ar2)
		{
			System.out.println("False");
		}
		else if(ar1!=ar3)
		{
			System.out.println("False");
		}
		else
		{
			System.out.println("True");
		}
	}

}
