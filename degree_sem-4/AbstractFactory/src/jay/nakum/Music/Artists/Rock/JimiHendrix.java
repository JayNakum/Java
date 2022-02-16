package jay.nakum.Music.Artists.Rock;

import jay.nakum.Music.Artists.Artist;

public class JimiHendrix extends Artist {

	public JimiHendrix() {
		songs[0] = "Purple Haze";
		songs[1] = "Little Wings";
		songs[2] = "All Along the Watchtower";
		songs[3] = "Voodoo Child";
		songs[4] = "Hey Joe";
	}
	
	@Override
	public String[] songs() {
		return songs;
	}
	
	@Override
	public String getArtistName() {
		return "Jimi Hendrix";
	}

}
