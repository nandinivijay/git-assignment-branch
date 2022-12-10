package forkproject;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class ReplaceString {
	
	public static String notreplace(String s)
	{
		for(int i=0;i<s.length()-1;i++)
		{
			int index=s.indexOf("is", i);
			if(index==0)
			{
				s=s.replaceFirst("is","is not");
			}
			if(index!=0 && !Character.isLetter(s.charAt(index-1)))
			{
				s=s.replace("is","is not");
			}
		}
			
		
		System.out.println(s);
		return s;
	
	}
	@Test
	public void testrun1()
	{
		String snew=notreplace("is this");
		String s1="is not this";
		Assert.assertEquals(s1, snew);
	}
	
	@Test
	public void testrun2()
	{
		String snew=notreplace("is-is");
		String s1="is not-is not";
		Assert.assertEquals(s1, snew);
	}

}
