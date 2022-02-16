package jay.nakum.Music.Factories;

import jay.nakum.Music.Artists.Artist;
import jay.nakum.Music.Artists.Rock.JimiHendrix;
import jay.nakum.Music.Artists.Rock.PinkFloyd;
import jay.nakum.Music.Artists.Rock.Queen;

public class RockFactory extends GenreFactory {

	private int availableArtists = 3;
	
	@Override
	public Artist getArtist() {
		int r = random.nextInt(availableArtists);
		switch (r) {
		case 0: 
			return new Queen();
		case 1:
			return new JimiHendrix();
		case 2:
			return new PinkFloyd();
		default:
			throw new IllegalArgumentException("Unexpected value: " + r);
		}
	}

}
