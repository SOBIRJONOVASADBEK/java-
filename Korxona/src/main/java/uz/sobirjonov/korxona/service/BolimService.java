package uz.sobirjonov.korxona.service;

public class BolimService {
  private final BolimRepository bolimRepository;

    public BolimService(BolimRepository bolimRepository) {
        this.bolimRepository = bolimRepository;
    }
    public Bolim add(Bolim bolim){
        return bolimRepository.save(bolim);
    }
    public void delete(Long id){
       Bolim bolim=bolimRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Xodim with ID " + id + " not found"));
       bolimRepository.delete(bolim);

    }

}
