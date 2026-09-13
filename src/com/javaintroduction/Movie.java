package com.javaintroduction;

public class Movie {
	int movieId;
	String movieName;
	static String industryName;

	public static void main(String[] args) {
		
		
		industryName = "tollywood";
		Movie m1 = new Movie();
		m1.movieId = 101;
		m1.movieName = "pushpa";
		System.out.println("Movie ID:" + m1.movieId);
		System.out.println("Movie Name:" + m1.movieName);
		System.out.println("Industry :"+industryName);
	
		
		Movie m2 = new Movie();
		m2.movieId = 102;
		m2.movieName = "RRR";
		System.out.println("Movie ID:" + m2.movieId);
		System.out.println("Movie Name:" + m2.movieName);
		System.out.println("Industry :"+industryName);
		
		Movie m3 = new Movie();
		m3.movieId = 103;
		m3.movieName = "Peddi";
		System.out.println("Movie ID:" + m3.movieId);
		System.out.println("Movie Name:" + m3.movieName);
		System.out.println("Industry :"+industryName);
		
		Movie.industryName = "bollywood";
		System.out.println(industryName);
	}

}
