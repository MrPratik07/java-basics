package designPatterns.Stuctural.Adaptar;

// Target interface
interface MediaPlayer {
    void play(String audioType, String fileName);
}

// Adaptee (Existing class)
class AdvancedMediaPlayer {
    void playMp4(String fileName) {
        System.out.println("Playing MP4 file: " + fileName);
    }
}

// Adapter Class
class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer = new AdvancedMediaPlayer();

    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}

// Client
public class AdapterExample {
    public static void main(String[] args) {
        MediaPlayer player = new MediaAdapter();
        player.play("mp4", "song.mp4");
    }
}

