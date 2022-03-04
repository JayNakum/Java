package jay.nakum.mediaplayer;

public class GaanaPlayer implements AdvancedMediaPlayer {
	@Override
	public void playSpotify(String fileName) {
		// Do nothing
	}

	@Override
	public void playGaana(String fileName) {
		System.out.println("Playing " + fileName);
	}

	@Override
	public void playJioSaavn(String fileName) {
		// Do nothing

	}
}
