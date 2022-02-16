package jay.nakum.Music.Artists;

public abstract class Artist {
	protected String[] songs = {"", "", "", "", ""};
	abstract public String getArtistName();
	abstract public String[] songs();
}
