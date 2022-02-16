package jay.nakum.Music.Artists.Rock;

import jay.nakum.Music.Artists.Artist;

public class PinkFloyd extends Artist {

	public PinkFloyd() {
		songs[0] = "Another Brick in The Wall";
		songs[1] = "Comfortably Numb";
		songs[2] = "Wish You Were Here";
		songs[3] = "Money";
		songs[4] = "Time";
	}
	
	@Override
	public String[] songs() {
		return songs;
	}
	
	@Override
	public String getArtistName() {
		return "Pink Floyd";
	}

}
