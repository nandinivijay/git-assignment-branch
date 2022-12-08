package pro_gitbranch.pro5;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MatchUp {
	private int matchup(String[] a, String[] b) {
		int res = 0;
		for (int i = 0; i < a.length; i++) {


			if (a[i] != "" && b[i] != "" && a[i].charAt(0) == b[i].charAt(0)) {
					res++;
					System.out.println(a[i].charAt(0) + " " + b[i].charAt(0));

			}
		}
		return res;
	}

	@Test
	public void test1() {
		String[] a = { "aaa", "bb", "ccc" };
		String[] b = { "aa", "yy", "" };
		int ans = matchup(a, b);
		System.out.println(ans);
		Assert.assertEquals(ans, 1);
	}

	@Test
	public void test2() {
		String[] a = { "aa", "bb", "cc" };
		String[] b = { "", "", "ccc" };
		int ans = matchup(a, b);
		System.out.println(ans);
		Assert.assertEquals(ans, 1);
	}

	@Test
	public void test3() {
		String[] a = { "aa", "bb", "cc" };
		String[] b = { "aaa", "b", "bb" };
		int ans = matchup(a, b);
		System.out.println(ans);
		Assert.assertEquals(ans, 2);
	}
}
