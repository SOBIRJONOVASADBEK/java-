package uz.sobirjonov.korxona.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.sobirjonov.korxona.entity.Pasport;
import uz.sobirjonov.korxona.service.PasportService;

@RestController
@RequestMapping("/pasport")
public class PasportController {
    private final PasportService pasportService;

    public PasportController(PasportService pasportService) {
        this.pasportService = pasportService;
    }
    @PostMapping("/save")
    public ResponseEntity<Pasport> savePasport(@RequestBody Pasport pasport){
        Pasport result=pasportService.addPasport(pasport);
        return ResponseEntity.ok(result);
    }
}
