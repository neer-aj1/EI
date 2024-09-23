package exercise1.structural.mediaPlayer;

public class AdvancedPlayer implements AdvancedMediaPlayer{
    public void playAudio(String fileName) {
        System.out.println("Playing audio file: " + fileName);
    }

    public void playVideo(String fileName) {
        System.out.println("Playing video file: " + fileName);
    }
}