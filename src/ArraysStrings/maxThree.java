package LinkList2;

import java.util.Arrays;

public class maxThree {

	public static void main(String args[])
	{
	//	int a[]= {2,8,5,6,7};
		
	//	int a[]= {-1,-2,-3,4,-5};
		
	//	int a[]= {-1,-2,-3,-4,-5};
		
	//	int a[]= {100,-70,-50,-1,3,0};
		
		//int a[] = {-1,-2,-3,-4,-5,-6};
		
		int a[]= {-10000,1,2,3,4};
		
		Arrays.sort(a);
		
		for(int i=0; i<a.length;i++)
			System.out.print(a[i]+"\t");
		System.out.println();
		
		int max = 0;
		
		if(a[a.length-1]>0 && a[a.length-2]>0 && a[a.length-3]>0 ||(a[a.length-1]<0 && a[a.length-2]<0 && a[a.length-3]<0))
			max = a[a.length-1]*a[a.length-2]*a[a.length-3];
		
		else if(a[0]<0 && a[1]<0 && a[a.length-1]>0)
			max = a[0] * a[1] * a[a.length-1];
			
			
			System.out.println(max);
		
		
	}
	
}
