import org.testng.Assert;
import org.testng.annotations.Test;

public class AddingYToTheStrings {
	@Test
	public void comparingStrings()
	{
		
		String[] st1 = {"aa", "bb", "cc"}, st2 = {"aaa", "xx", "bb"}, st3 = {"", "", "ccc"};
		String[] expected1 = {"yaay","ybby","yccy"};
		String[] expected2 = {"yaaay","yxxy","ybby"};
		String[] expected3 = {"yy","yy","ycccy"};
		Assert.assertEquals(expected1, addingY(st1));
		Assert.assertEquals(expected2, addingY(st2));
		Assert.assertEquals(expected3, addingY(st3));
	}

	public String[] addingY(String[] str) {
		for(int i=0;i<str.length;i++)
		{
			str[i] = "y"+str[i]+"y";
		}
		
		return str;
	}
}
