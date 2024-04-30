interface MediaPlayer{
    public void play(String audioType, String fileName);
}

interface AdvancedMediaPlayer{
    public void playVlc(String fileName);
    public void playMp4(String fileName);
}

class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName){
        System.out.println("Playing VLC file name : " + fileName);
    }
    public void playMp4(String fileName){
        // Do nothing
    }
}

class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName){
        // Do nothing
    }
    public void playMp4(String fileName){
        System.out.println("Playing MP4 file name : " + fileName);
    }
}

class MediaAdapter implements MediaPlayer{
    AdvancedMediaPlayer advancedMusicPlayer;
    public MediaAdapter(String audioType){
        if (audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer=new VlcPlayer();
        }
        else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer=new Mp4Player();
        }
    }

    public void play(String audioType, String fileName){
        if (audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(fileName);
        }
        else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}

class AudioPlayer implements MediaPlayer{
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType,String fileName){

        // inbuilt support to play mp3 music files
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing MP3 file name : " + fileName);
        }
        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType,fileName);
        }
        else{
            System.out.println("Invalid Media" + audioType + "format not supported.");
        }
    }
}

class Client{
    public static void main(String[] args){
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3" , "Beyond the Horizon.mp3");
        audioPlayer.play("mp4" , "Alone.mp4");
        audioPlayer.play("vlc" , "Far Far Away.mp3");
        audioPlayer.play("avi" , "Mind Me.mp3");
    }
}