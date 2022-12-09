package moreY;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AddMoreY {
	private String[] addy(String[] a) {
		String[] res = new String[a.length];
		for (int i = 0; i < a.length; i++) {
			res[i] = "y" + a[i] + "y";
		}
		return res;
	}

	@Test
	public void test1() {
		String[] a = { "a", "bb", "ccc" };
		String[] ans = addy(a);
		String[] exp = { "yay", "ybby", "ycccy" };
		for (int i = 0; i < ans.length; i++) {

			System.out.print(ans[i] + " ");
			Assert.assertEquals(ans[i], exp[i]);
		}
	}

	@Test
	public void test2() {
		String[] a = { "hello", "there" };
		String[] ans = addy(a);
		String[] exp = { "yhelloy", "ytherey" };
		for (int i = 0; i < ans.length; i++) {

			System.out.print(ans[i] + " ");
			Assert.assertEquals(ans[i], exp[i]);
		}

	}

	@Test
	public void test3() {
		String[] a = { "yay" };
		String[] ans = addy(a);
		String[] exp = { "yyayy" };
		for (int i = 0; i < ans.length; i++) {

			System.out.print(ans[i] + " ");
			Assert.assertEquals(ans[i], exp[i]);
		}
	}
}
