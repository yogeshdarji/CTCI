package ArraysStrings;

public class Permutation {

	int permut(String s1, String s2)
	{
		int flag=0;
		
		if(s1.length()!=s2.length())
			flag = -1;
		
		else{
			
			sort(s1).equals(sort(s2));
			flag = 1;
			
		}
		
		return flag;
		
	}
	
	public String sort(String s)
	{
		char c[] = s.toCharArray();
		java.util.Arrays.sort(c);
		return new String(c);
	}
	
	public static void main(String args[])
	{
		Permutation p = new Permutation();
		int ans = p.permut("Fish", "FshIjj");
		
		if(ans == 1)
		{
			System.out.print("The strings are same");
		}
		else
		{
			System.out.print("The strings are different");
		}
		
	}
	
}



