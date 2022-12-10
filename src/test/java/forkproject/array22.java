package forkproject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class array22 {
	
	public static Boolean has22(int[] num)
	{
		boolean b=false;
		for(int i=0;i<num.length-1;i++)
		{
		
			if((num[i]==2 )&&( num[i+1]==2))
				b=true;
			
			
		}
		return b;
	}
	
	@Test
	public void testrun1() {
		int[] num= {1,2,2,1};
		boolean expected=true;
		boolean actual=has22(num);
		Assert.assertEquals(actual, expected);
		
		
	}
	
	@Test
	public void testrun2()
	{
		int[] num1= {1,2,1,2};
		boolean expected =false;
		boolean actual=has22(num1);
	}

}
