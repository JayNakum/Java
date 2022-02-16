package jay.nakum.Music.Factories;

import jay.nakum.Music.Artists.Artist;
import jay.nakum.Music.Artists.Blues.BBKing;
import jay.nakum.Music.Artists.Blues.EricClapton;
import jay.nakum.Music.Artists.Blues.StevieRayVaughan;

public class BluesFactory extends GenreFactory {
	
	private int availableArtists = 3;
	
	@Override
	public Artist getArtist() {
		int r = random.nextInt(availableArtists);
		switch (r) {
		case 0: 
			return new StevieRayVaughan();
		case 1:
			return new BBKing();
		case 2:
			return new EricClapton();
		default:
			throw new IllegalArgumentException("Unexpected value: " + r);
		}
	}
	
}
