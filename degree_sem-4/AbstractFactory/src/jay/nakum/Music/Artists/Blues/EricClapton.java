package jay.nakum.Music.Artists.Blues;

import jay.nakum.Music.Artists.Artist;

public class EricClapton extends Artist {

	public EricClapton() {
		songs[0] = "Tears in Heaven";
		songs[1] = "Wonderful Tonight";
		songs[2] = "Layla";
		songs[3] = "Cocaine";
		songs[4] = "Autumn Leaves";
	}
	
	@Override
	public String[] songs() {
		return songs;
	}
	
	@Override
	public String getArtistName() {
		return "Eric Clapton";
	}
	
}
