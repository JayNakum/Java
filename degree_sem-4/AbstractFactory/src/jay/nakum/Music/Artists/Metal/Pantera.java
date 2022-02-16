package jay.nakum.Music.Artists.Metal;

import jay.nakum.Music.Artists.Artist;

public class Pantera extends Artist {

	public Pantera() {
		songs[0] = "Cemetery Gates";
		songs[1] = "Walk";
		songs[2] = "Domination";
		songs[3] = "5 Minutes Alone";
		songs[4] = "This Love";
	}
	
	@Override
	public String[] songs() {
		return songs;
	}
	
	@Override
	public String getArtistName() {
		return "Pantera";
	}

}
