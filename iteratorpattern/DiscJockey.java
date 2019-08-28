package com.collabera.designpatterns.iteratorpattern;

import java.util.Iterator;

public class DiscJockey {
	
	SongsOfThe70s songs70s;
	SongsOfThe80s songs80s;
	SongsOfThe90s songs90s;
	
	SongIterator iter70sSongs;
	SongIterator iter80sSongs;
	SongIterator iter90sSongs;

	public DiscJockey(SongIterator newSongs70s, SongIterator newSongs80s, SongIterator newSongs90s) {
		
		iter70sSongs = newSongs70s;
		iter80sSongs = newSongs80s;
		iter90sSongs = newSongs90s;
		
	}
	
	public void showTheSongs() {
		Iterator songs70s = iter70sSongs.createIterator();
		Iterator songs80s = iter80sSongs.createIterator();
		Iterator songs90s = iter90sSongs.createIterator();
		
		System.out.println("Songs of the 70s\n");
		printTheSongs(songs70s);
		System.out.println("\n");
		System.out.println("Songs of the 80s\n");
		printTheSongs(songs80s);
		System.out.println("\n");
		System.out.println("Songs of the 90s\n");
		printTheSongs(songs90s);

	}
	
	public void printTheSongs(Iterator iterator) {
		while (iterator.hasNext()) {
			
			SongInfo songInfo = (SongInfo) iterator.next();
			System.out.println(songInfo.getSongName());
			System.out.println(songInfo.getBandName());
			System.out.println(songInfo.getYearReleased());
		}
	}
	

}
