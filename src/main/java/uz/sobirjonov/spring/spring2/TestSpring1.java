package uz.sobirjonov.spring.spring2;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestSpring1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        Music music=context.getBean("musicBean",Music.class);
        MusicPlayer musicPlayer=new MusicPlayer(music);
        musicPlayer.playMusic();
        context.close();

    }
}
