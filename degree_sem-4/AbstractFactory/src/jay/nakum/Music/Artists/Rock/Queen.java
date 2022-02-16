package jay.nakum.Music.Artists.Rock;

import jay.nakum.Music.Artists.Artist;

public class Queen extends Artist {
	public Queen() {
		songs[0] = "Bohemian Rhapsody";
		songs[1] = "Love of My Life";
		songs[2] = "We are the Champions";
		songs[3] = "Under Pressure";
		songs[4] = "Another One Bites the Dust";
	}
	
	@Override
	public String[] songs() {
		return songs;
	}
	
	@Override
	public String getArtistName() {
		return "Queen";
	}

}
