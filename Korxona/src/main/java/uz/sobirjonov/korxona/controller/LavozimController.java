package uz.sobirjonov.korxona.controller;

import org.springframework.web.bind.annotation.*;
import uz.sobirjonov.korxona.entity.Lavozim;

@RestController
@RequestMapping("/lavozim")
@CrossOrigin(value = "*")

public class LavozimController {
    @PostMapping("/direktor")
    public Lavozim direktor() {
        return Lavozim.builder()
                .id(1L)
                .name("Direktor").build();
    }
    @PostMapping("/bolim")
    public Lavozim bolim() {
        return Lavozim.builder()
                .id(2L)
                .name("BolimBoshlqi").build();
    }
    @PostMapping("/xodim")
    public Lavozim xodim() {
        return Lavozim.builder()
                .id(3L)
                .name("Direktor").build();
    }


}
