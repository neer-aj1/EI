package exercise1.structural.mediaPlayer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MediaPlayer player = new AdvanceMediaPlayerAdapter(new AdvancedPlayer());

        System.out.println("Enter media type (audio/video): ");
        String mediaType = scanner.nextLine();

        System.out.println("Enter file name: ");
        String fileName = scanner.nextLine();

        player.play(mediaType, fileName);

        scanner.close();
    }
}