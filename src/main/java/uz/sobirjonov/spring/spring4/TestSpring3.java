package uz.sobirjonov.spring.spring4;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import uz.sobirjonov.spring.spring3.MusicPlayer1;

public class TestSpring3 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        MusicPlayer2 musicPlayer=context.getBean("musicPlayer2", MusicPlayer2.class);
        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        context.close();

    }
}
