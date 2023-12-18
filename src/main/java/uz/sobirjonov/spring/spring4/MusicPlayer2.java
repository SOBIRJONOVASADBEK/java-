package uz.sobirjonov.spring.spring4;


import java.util.ArrayList;
import java.util.List;

public class MusicPlayer2 {
    private List<Music2> music2List=new ArrayList<>();
    private String  name;
    public int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    private Music2 music;
    public MusicPlayer2(Music2 music){
        this.music=music;
    }
    public MusicPlayer2(){

    }
    public void setMusic(Music2 music){
        this.music=music;
    }
    public void playMusic(){
        System.out.println("Playing :"+music.getSong());
    }
}
