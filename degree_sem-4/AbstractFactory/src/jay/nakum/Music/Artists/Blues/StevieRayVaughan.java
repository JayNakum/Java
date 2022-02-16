package jay.nakum.Music.Artists.Blues;

import jay.nakum.Music.Artists.Artist;

public class StevieRayVaughan extends Artist {
	
	public StevieRayVaughan() {
		songs[0] = "Pride and Joy";
		songs[1] = "Little Wing";
		songs[2] = "Marry Had a Little Lamb";
		songs[3] = "Voodoo Child";
		songs[4] = "Change It";
	}

	@Override
	public String[] songs() {
		return songs;
	}
	
	@Override
	public String getArtistName() {
		return "Stevie Ray Vaughan";
	}

}
