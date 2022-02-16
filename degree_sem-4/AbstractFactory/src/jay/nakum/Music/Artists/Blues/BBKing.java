package jay.nakum.Music.Artists.Blues;

import jay.nakum.Music.Artists.Artist;

public class BBKing extends Artist {
	
	public BBKing() {
		songs[0] = "Thrill is Gone";
		songs[1] = "When My Heart Beats Like a Hammer";
		songs[2] = "Chains and Things";
		songs[3] = "Why I Sing the Blues";
		songs[4] = "Live At the Regal";
	}
	
	@Override
	public String[] songs() {
		return songs;
	}

	@Override
	public String getArtistName() {
		return "B.B. King";
	}
}
