package jay.nakum.mediaplayer;

public class AudioPlayer implements MediaPlayer {
	MediaAdapter mediaAdapter;

	@Override
	public void play(String audioType, String fileName) {

		if (audioType.equalsIgnoreCase("jiosaavn")) {
			System.out.println("Playing mp3 file. Name: " + fileName);
		}

		else if (audioType.equalsIgnoreCase("Spotify") || audioType.equalsIgnoreCase("Gaana")) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		}

		else {
			System.out.println("Invalid media. " + audioType + " format not supported");
		}
	}
}
