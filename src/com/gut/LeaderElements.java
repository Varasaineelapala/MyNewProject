package com.gut;

public class LeaderElements {
	static void leader(int[] arr) {
		int leader = Integer.MIN_VALUE;
		String leaderElements = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			if (leader < arr[i]) {
				leader = arr[i];
				leaderElements = leader +" "+leaderElements;
			}
		}
		System.out.println(leaderElements);
	}

	public static void main(String[] args) {
		int[] arr = { 16, 17, 5, 7, 1, 2 };
		leader(arr);
	}

}
