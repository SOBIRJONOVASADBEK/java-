package uz.sobirjonov.spring.spring3;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        MusicPlayer1 musicPlayer=context.getBean("musicPlayer", MusicPlayer1.class);
        musicPlayer.playMusic();
        context.close();

    }
}
