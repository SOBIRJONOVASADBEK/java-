package uz.sobirjonov.korxona.controller;
@RestController
@RequestMapping("/bolim")
public class BolimController {
   private final BolimService bolimService;

    public BolimController(BolimService bolimService) {
        this.bolimService = bolimService;
    }
    @PostMapping("/save")
    public ResponseEntity<Bolim> addBolim(@RequestBody Bolim bolim){
        Bolim result=bolimService.add(bolim);
        return ResponseEntity.ok(result);
    }
    @DeleteMapping("/delete")
    public ResponseEntity<String> delete(@RequestParam Long id){
        bolimService.delete(id);
        return ResponseEntity.ok("Bo'lim o'chirildi");
    }
}
