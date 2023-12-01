package uz.sobirjonov.korxona.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uz.sobirjonov.korxona.entity.Xodim;
import uz.sobirjonov.korxona.service.XodimService;

import java.util.List;

@RestController
@RequestMapping("/xodim")
public class XodimController {
    private final XodimService xodimService;


    public XodimController(XodimService xodimService) {
        this.xodimService = xodimService;
    }

    @PostMapping("/save")
    public ResponseEntity<Xodim> addXodim(@RequestBody Xodim xodim){
        Xodim result=xodimService.addXodim(xodim);
        return ResponseEntity.ok(xodim);
    }
    @DeleteMapping("delete")
    public ResponseEntity<String> deleteXodim(@RequestParam Long id){
        xodimService.deleteXodim(id);
        return ResponseEntity.ok("Xodim o'chirildi");
    }
    @GetMapping("find/id")
    public ResponseEntity<Xodim> finById(@RequestParam Long id){
        Xodim result=xodimService.finById(id);
        return ResponseEntity.ok(result);
    }
    @GetMapping("findAll")
    public ResponseEntity<List<Xodim>> findAll(){
        List<Xodim> xodim=xodimService.findAllXodim();
        return ResponseEntity.ok(xodim);
    }



}
