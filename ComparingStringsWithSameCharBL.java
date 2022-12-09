package javaprogrames;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ComparingStringsWithSameCharBL {
	public int compString(String[] arr1, String[] arr2) {
		int count = 0;

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i].length() > 0 && arr2[i].length() > 0) {
				if (arr1[i].charAt(0) == arr2[i].charAt(0)) {
					count++;
					System.out.println(arr1[i].charAt(0));
					System.out.println(arr2[i].charAt(0));
				}

			}
			System.out.println(arr1[i].length());
			System.out.println(arr2[i].length());

		}
		// System.out.println(arr1[i].length());
		return count;

	}

	@Test
	public void testcase1() {
		String[] arr1 = { "aa", "bb", "cc" };
		String[] arr2 = { "aaa", "xx", "bb" };
		int count = compString(arr1, arr2);
		System.out.println("count " + count);
		Assert.assertEquals(count, 1);

	}

	@Test
	public void testcase2() {
		String[] arr1 = { "aa", "bb", "cc" };
		String[] arr2 = { "", "", "ccc" };
		int count = compString(arr1, arr2);
		System.out.println("count " + count);
		Assert.assertEquals(count, 1);

	}

}
