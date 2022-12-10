package forkproject;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class specialscore {
	
	public static int specialadd(int[] num1,int[] num2)
	{
		int num1big=findBig(num1);
		int num2big=findBig(num2);
		int sum=num1big+num2big;
		return sum;
	}
	public static int findBig(int[] x)
	{
		int max=0;
		for(int i=0;i<x.length;i++)
		{
			if(x[i]>max && x[i]%10==0)
			{
				max=x[i];
			}
		}
		return max;
		
	}

	@Test
	public void testrun1()
	{
		int[] num1= {12,10,4};
		int[] num2= {2,20,30};
		int actual=specialadd(num1,num2);
		int expected=40;
		Assert.assertEquals(expected,actual);
	}
	
	@Test
	public void testrun2()
	{
		int[] num1= {20,10,4};
		int[] num2= {2,20,30};
		int actual=specialadd(num1,num2);
		int expected=50;
		Assert.assertEquals(expected,actual);
	}
}
