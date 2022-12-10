package forkproject;

import org.testng.Assert;
import org.testng.annotations.Test;

public class matchString {
	
	public static int matchup(String[] s1,String[] s2)
	{
		int count=0;
		for(int i=0;i<s1.length;i++)
		{
			String sone=s1[i];
			String stwo=s2[i];
			if(sone.charAt(0)==stwo.charAt(0))
				count++;
		}
		
		System.out.println(count);
		return count;
		
		
	}
	@Test
	public void testrun1()
	{
		String[] s1= {"aa","bb","ccc"};
		String[] s2= {"aaa","b","dd"};
		int x=matchup(s1,s2);
		int y=2;
		Assert.assertEquals(y, x);

}
	
	@Test
	public void testrun2()
	{
		String[] s1= {"aa","bb","cc"};
		String[] s2= {"aaa","xx","bb"};
		int x=matchup(s1,s2);
		int y=1;
		Assert.assertEquals(y, x);

	
	}
}