package jay.nakum.mediaplayer;

public class SpotifyPlayer implements AdvancedMediaPlayer {

	@Override
	public void playSpotify(String fileName) {
		System.out.println("Playing " + fileName);
	}

	@Override
	public void playGaana(String fileName) {
		// Do nothing
	}

	@Override
	public void playJioSaavn(String fileName) {
		// Do nothing
	}

}
