package Sample1;

public class Reverse
{
	public static void main(String[] args)
	{
		String s="Ankit";
	 String reverse="";
		for(int i=s.length()-1;i>=0;i--) //s.length()-1-->printing the no of digit of string
		{
			reverse=reverse+s.charAt(i);//s.chatAt(i)-->return string values at given index	
		}
		System.out.println(reverse);

	}

}
