package uz.sobirjonov.spring.spring3;

import uz.sobirjonov.spring.spring2.Music;

public class RocMusic1 implements Music1 {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}