package jay.nakum.Music;

import jay.nakum.Music.Artists.Artist;
import jay.nakum.Music.Factories.SongSuggester;

public class Musician {

	public static void main(String[] args) {
		Artist artist = new SongSuggester().suggest().getArtist();
		String name = artist.getArtistName();
		String[] songs = artist.songs();
		System.out.println("\nArtist: " + name);
		System.out.print("Songs: ");
		for (int i = 0; i < songs.length; i++) {
			System.out.println("\t" + songs[i]);
		}
	}

}
