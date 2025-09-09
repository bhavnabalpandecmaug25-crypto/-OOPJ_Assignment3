interface AudioPlayer {
    void playAudio(String song);
}
interface VideoPlayer {
    void playVideo(String movie);
}
class MediaPlayer implements AudioPlayer, VideoPlayer {
    public void playAudio(String song) {
        System.out.println("Playing Audio: " + song);
    }
    public void playVideo(String movie) {
        System.out.println("Playing Video: " + movie);
    }
}
public class MediaPlayerTest {
    public static void main(String[] args) {
        MediaPlayer mp = new MediaPlayer();
        mp.playAudio("Shape of You");
        mp.playVideo("Inception");
    }
}
