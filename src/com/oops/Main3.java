package com.oops;

class Courses {
	int duration = 6;

	void duration() {
		System.out.println("Course duration : " + duration + " Months");
	}
}

class JavaCourse extends Courses {
	int duration = 6;

	@Override
	void duration() {
		System.out.println("Java Course duration : " + duration + " Months");
	}
}

class PythonCourse extends Courses {
	int duration = 4;

	@Override
	void duration() {
		System.out.println("Python Course duration : " + duration + " Months");
	}
}

class SQLCourse extends Courses {
	int duration = 3;

	@Override
	void duration() {
		System.out.println("SQL Course duration : " + duration + " Months");
	}
}

public class Main3 {

	public static void main(String[] args) {
		Courses c = new Courses();
		JavaCourse j = new JavaCourse();
		PythonCourse p = new PythonCourse();
		SQLCourse s = new SQLCourse();

		c.duration();
		j.duration();
		p.duration();
		s.duration();
		
	}

}
