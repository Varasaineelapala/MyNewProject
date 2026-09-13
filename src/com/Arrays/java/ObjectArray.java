package com.Arrays.java;

public class ObjectArray {
	static void display(Object[] obj) {
//		for (Object o : obj) {
//			if (o instanceof Number) {
//				System.out.print(o + " ");
//			} else if (o instanceof int[] nums) {
//				for (int n : nums) {
//					System.out.print(n + " ");
//				}
//			} else if (o instanceof Object[] ob) {
//				display(ob);
//			}
//		}
		int n = obj.length;
		for (int i = n - 1; i >= 0; i--) {
			if (obj[i] instanceof Number) {
				System.out.print(obj[i] + " ");
			} else if (obj[i] instanceof int[] nums) {
				for (int j = nums.length - 1; j >= 0; j--) {
					System.out.print(nums[j] + " ");
				}
			} else if (obj[i] instanceof Object[] ob) {
				display(ob);
			}
		}
	}

	public static void main(String[] args) {
		String[] arr = null;
		char[] arr2 = null;
//		Object[] obj1 = { 1, "sai", 2, arr, arr2, new int[] { 3, 4, 5 }, new Object[] { "alice,bob" } };
//		Object[] obj2 = { 6, "sai", 7, arr, arr2, new int[] { 8, 9, 10 }, new Object[] { "alice,bob" }, obj1 };
		Object[] obj3 = { 11, "sai", 12, arr, arr2, new int[] { 13, 14, 15 }, new Object[] { "alice,bob" } };

		display(obj3);
	}

}
