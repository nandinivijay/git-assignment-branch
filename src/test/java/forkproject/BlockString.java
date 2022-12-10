package forkproject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BlockString {
	public static int maxBlock(String s)
	{
		int maxcount=0;
		if(s.length()==0)
		{
			return maxcount;
		}
		int count=1;
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
			{
				count++;
				
			}
			else
			{
				if(maxcount<count)
				{
					maxcount=count;
					count=1;
				}
			}
		}
		return maxcount;
		
	}
	@Test
	public void run1()
	{
		int x=4;
		int n=maxBlock("abbCCCCddd");
		Assert.assertEquals(x,n);
	}
	@Test
	public void run2()
	{
		int x=2;
		int n=maxBlock("hoopla");
		Assert.assertEquals(x,n);
	}
	@Test
	public void run3()
	{
		int x=0;
		int n=maxBlock("");
		Assert.assertEquals(x,n);
	}
}


