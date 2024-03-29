package com.collabera.designpatterns.compositepattern;

public class Song extends SongComponent {

	String songName;
	String bandName;
	int releaseYear;
	
	public Song(String newSongName, String newBandName, int newYearReleased ) {
		
		songName = newSongName;
		bandName = newBandName;
		releaseYear = newYearReleased;

	}
		
	public String getSongName() {
		
		return songName;
		
	}
	
	public String getBandName() {
		
		return bandName;
		
	}
	
	public int getYearReleased() {
		
		return releaseYear;
		
	}
	
	public void displaySongInfo() {
		System.out.println(getSongName() + " was recorded by " + 
				getBandName() + " in " + getYearReleased());
	}
	
}
