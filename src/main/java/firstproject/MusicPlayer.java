package firstproject;

public class MusicPlayer {
    private Music music;

    //IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }
    public void PlayMusic() {
        System.out.println("Now playing: " + music.getSong());
    }
}
