package jay.nakum.mediaplayer;

public class MediaAdapter implements MediaPlayer {

	AdvancedMediaPlayer musicPlayer;

	public MediaAdapter(String audioType) {
		if (audioType.equalsIgnoreCase("spotify")) {
			musicPlayer = new SpotifyPlayer();

		} else if (audioType.equalsIgnoreCase("gaana")) {
			musicPlayer = new GaanaPlayer();
		} else if (audioType.equalsIgnoreCase("jiosaavn")) {
			musicPlayer = new JioSaavnPlayer();
		}
	}

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("spotify")) {
			musicPlayer.playSpotify(fileName);
		} else if (audioType.equalsIgnoreCase("Gaana")) {
			musicPlayer.playGaana(fileName);
		} else if (audioType.equalsIgnoreCase("JioSaavn")) {
			musicPlayer.playJioSaavn(fileName);
		}
	}
}
