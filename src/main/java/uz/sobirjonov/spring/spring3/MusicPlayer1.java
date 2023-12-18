package uz.sobirjonov.spring.spring3;


import uz.sobirjonov.spring.spring2.Music;

public class MusicPlayer1 {
    private Music1 music;
    public MusicPlayer1(Music1 music){
        this.music=music;
    }
    public void playMusic(){
        System.out.println("Playing :"+music.getSong());
    }
}