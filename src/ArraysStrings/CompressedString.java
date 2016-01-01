package ArraysStrings;

public class CompressedString {

	public String compressed(String s)
	{
	
		int count=1;
		String ans ="";
		char last = s.charAt(0);
		
		
		for(int i=1;i<s.length();i++)
		{
			
			
			if(s.charAt(i)==last)
			{
				
				count++;
			}
			
			else
			{
				ans = ans +"" +last + ""+count;
				count = 1;
				last = s.charAt(i);
			}
			
		}
		
		
		return ans+last+count;
		    
			
		}
	
	public static void main(String args[])
	{
		CompressedString cs = new CompressedString();
		
		String result = cs.compressed("aabccccaaad");
		
		System.out.println(result);
	}
	
}
