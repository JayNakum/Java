package jay.nakum.Music.Artists.Metal;

import jay.nakum.Music.Artists.Artist;

public class DreamTheater extends Artist {

	public DreamTheater() {
		songs[0] = "Pull Me Under";
		songs[1] = "Panic Attack";
		songs[2] = "Another Day";
		songs[3] = "Awaken the Master";
		songs[4] = "As I Am";
	}
	
	@Override
	public String[] songs() {
		return songs;
	}
	
	@Override
	public String getArtistName() {
		return "Dream Theater";
	}

}
