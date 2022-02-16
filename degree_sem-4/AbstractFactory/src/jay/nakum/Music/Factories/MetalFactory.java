package jay.nakum.Music.Factories;

import jay.nakum.Music.Artists.Artist;
import jay.nakum.Music.Artists.Metal.DreamTheater;
import jay.nakum.Music.Artists.Metal.Metallica;
import jay.nakum.Music.Artists.Metal.Pantera;

public class MetalFactory extends GenreFactory {
	
	private int availableArtists = 3;
	
	@Override
	public Artist getArtist() {
		int r = random.nextInt(availableArtists);
		switch (r) {
		case 0: 
			return new DreamTheater();
		case 1:
			return new Metallica();
		case 2:
			return new Pantera();
		default:
			throw new IllegalArgumentException("Unexpected value: " + r);
		}
	}

}
