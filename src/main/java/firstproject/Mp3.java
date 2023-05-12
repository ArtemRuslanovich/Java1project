package firstproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mp3 {
    private int id;
    private MusicPlayer musicPlayer;
    @Autowired
    public Mp3(MusicPlayer musicPlayer) {
        this.id = 1;
        this.musicPlayer = musicPlayer;
    }

    @Override
    public String toString() {
        return "mp3 " +
                "id=" + id +
                ", musicPlayer = " + musicPlayer.PlayMusic();
    }
}
