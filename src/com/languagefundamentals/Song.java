package com.languagefundamentals;

public class Song {
	String title;
	String artist;
	int trackNumber;
	double rating;

	Song(String title, String artist, int trackNumber, double rating) {
		this.title = title;
		this.artist = artist;
		this.trackNumber = trackNumber;
		this.rating = rating;
	}

	Song(Song s) {
		this.title = s.title;
		this.artist = s.artist;
		this.trackNumber = s.trackNumber;
		this.rating = s.rating;
	}

	void display() {
		System.out.println("Song Tittle  : " + title);
		System.out.println("Artist       : " + artist);
		System.out.println("Track Number : " + trackNumber);
		System.out.printf("Song Rating  : " + "%.1f", rating);
		System.out.println();
		System.out.println("=============================");
	}

	void rateSong(double newRating) {
		rating = (rating + newRating) / 2;
	}

	void updateTrackNumber(int newTrack) {
		trackNumber = newTrack;
	}

	public static void main(String[] args) {
		Song s1 = new Song("Apocalypse", "cigaratte after sex", 1, 4.6);
		s1.display();
		
		Song s2 = new Song(s1);
		s2.rateSong(4.2);
		s2.updateTrackNumber(3);
		s2.display();
	}

}
