package com.Arrays.java;

public class Container {

	public static void main(String[] args) {
		int[] heights = { 4, 5, 6, 4, 5, 4, 8, 6 };
		int left = 0;
		int width = 0;
		int height = 0;
		int max = 0;
		int area = 0;int a=0,b=0;
		int right = heights.length - 1;
		while (left < right) {
			width = right - left;
			height = Math.min(heights[left], heights[right]);
			area = width * height;
			if (max < area) {
				max = area;
				a=left;
				b=right;}
				if (heights[left] < heights[right]) {
					left++;
				} else {
					right--;
				}
			} 		
		System.out.println("max Area " + max+" between "+a+" and "+b);
	}
}