package jay.nakum.mediaplayer;

public class Main {
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("jiosaavn", "wonderful tonight.mp3");
		audioPlayer.play("Gaana", "song for guy.mp3");
		audioPlayer.play("Spotify", "bohemian rhapsody.vlc");

	}
}
