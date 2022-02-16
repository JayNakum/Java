package jay.nakum.Music.Factories;

import java.util.Random;

import jay.nakum.Music.Artists.Artist;

public abstract class GenreFactory {
	protected Random random = new Random();
	abstract public Artist getArtist();
}
