package jay.nakum.Music.Artists.Metal;

import jay.nakum.Music.Artists.Artist;

public class Metallica extends Artist {

	public Metallica() {
		songs[0] = "Fade to Black";
		songs[1] = "Nothing Else Matters";
		songs[2] = "One";
		songs[3] = "And The Justice for All";
		songs[4] = "Enter Sandman";
	}
	
	@Override
	public String[] songs() {
		return songs;
	}
	
	@Override
	public String getArtistName() {
		return "Metallica";
	}

}
