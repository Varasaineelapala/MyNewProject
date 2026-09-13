package com.sorts;

public class MergingAarrays {
	int a[] = { 1, 6, 8 };
	int b[] = { 2, 5, 7, 9, 12, 18, };
	int n1 = a.length;
	int n2 = b.length;
	int i = 0;
	int j = 0;
	int k = 0;
	int result[] = new int[n1 + n2];
	int r = result.length;

	void merge() {
		for (int k = 0; k < r; k++) {
			if (i == n1) {
				result[k] = b[j];
				j++;
			} else if (j == n2) {
				result[k] = b[j];
				i++;
			}

			else {
				if (a[i] <= b[j]) {
					result[k] = a[i];
					i++;
				} else if (b[j] < a[i]) {
					result[k] = b[j];
					j++;
				}
			}
		}
	}

	void display() {
		for (int i = 0; i < r; i++) {
			System.out.print(result[i] + " ");
		}
	}

	public static void main(String[] args) {
		MergingAarrays ma = new MergingAarrays();
		ma.merge();
		ma.display();

	}

}
