package firstproject;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        Music music = context.getBean("rockMusic", Music.class);
//        Music music2 = context.getBean("classicalMusic", Music.class);
//
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        MusicPlayer classicalMusicPlayer = new MusicPlayer(music2);
//        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
//        System.out.println(classicalMusic.getSong());

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.PlayMusic();

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
//        Mp3 mp3 = context.getBean("mp3", Mp3.class);
//        System.out.println(mp3);
        context.close();
    }
}
