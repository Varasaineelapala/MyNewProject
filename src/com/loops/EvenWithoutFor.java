package com.loops;

public class EvenWithoutFor {
	int n;

	void even() {
		if (n < 100) {
			if (n % 2 == 0) {
				System.out.print(n+ " ");
			}
		} else {
			return;
		}
		n++;
		even();
	}

	public static void main(String[] args) {
		EvenWithoutFor ewf = new EvenWithoutFor();
		ewf.even();
	}

}
