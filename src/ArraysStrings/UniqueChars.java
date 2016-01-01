package ArraysStrings;

public class UniqueChars {

	static int isUnique(String s)
	{
		
		
		boolean arr[] = new boolean[256];
		int flag=1;
		
		if(s.length()>128)
			flag =-1;
		
		else{
		
		for(int i=0; i<s.length(); i++)
		{
			int val= s.charAt(i);
			
			if(arr[val]==true)
				{
				flag = -1;
				//System.out.println("Inside if true");
				break;
				}
				
			else
				{
				//System.out.println("Inside if false");
				//System.out.println(abc[i]+" is before "+arr[i]);
				arr[val]=true;
				//System.out.println(abc[i]+" is "+arr[i]);
				}
			
			
		}
		
		
		}
		
		return flag;
	}
	
	
	public static void main(String args[])
	{
		int result = isUnique("apple");
		
		if(result == -1)
			System.out.println("The string is not unique");
		else 
			System.out.println("String is Unique");
	}
	
	
}
