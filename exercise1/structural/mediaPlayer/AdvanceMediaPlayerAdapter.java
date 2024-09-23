package exercise1.structural.mediaPlayer;

class AdvanceMediaPlayerAdapter implements MediaPlayer{
    private AdvancedMediaPlayer advancedMediaPlayer;
    public AdvanceMediaPlayerAdapter(AdvancedMediaPlayer advancedMediaPlayer){
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    @Override
    public void play(String mediaType, String fileName) {
        if(mediaType.equalsIgnoreCase("audio")){
            advancedMediaPlayer.playAudio(fileName);
        } else if(mediaType.equalsIgnoreCase("video")) {
            advancedMediaPlayer.playVideo(fileName);
        } else{
            System.out.println("Invalid media type: " + mediaType);
        }
    }
}