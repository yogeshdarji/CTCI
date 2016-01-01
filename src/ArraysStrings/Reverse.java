package ArraysStrings;

public class Reverse {

	void reverseStr(String s)
	{
		char a[]= new char[100];

		
		for(int i=0; i<s.length();i++)
		{
			a[i]=s.charAt(i);
			
		}
		
		for(int j=s.length()-1;j>=0;j--)
		{
			System.out.print(a[j]);
		}
		
	}
	
	 public static void main(String args[])
	 	{
		 	Reverse r = new Reverse();
		 	r.reverseStr("apple");
		}
}
