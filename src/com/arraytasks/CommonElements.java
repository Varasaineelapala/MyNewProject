package com.arraytasks;

public class CommonElements {
	static void common(int [] arr1,int [] arr2) {
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.print(arr2[j]+" ");
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		int [] arr1= {2,4,5,9};
		int [] arr2= {2,3,4,5,5,6,7};
		common(arr1,arr2);
	}

}
