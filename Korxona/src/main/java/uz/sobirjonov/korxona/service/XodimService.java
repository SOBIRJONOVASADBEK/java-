package uz.sobirjonov.korxona.service;

import org.springframework.stereotype.Service;
import uz.sobirjonov.korxona.entity.Xodim;
import uz.sobirjonov.korxona.repository.XodimRepository;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

@Service
public class XodimService {
    private final XodimRepository xodimRepository;

    public XodimService(XodimRepository xodimRepository) {
        this.xodimRepository = xodimRepository;
    }
    public Xodim addXodim(Xodim xodim){
        return xodimRepository.save(xodim);
    }
    public void deleteXodim(Long id){
      Xodim xodim=xodimRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Xodim with ID " + id + " not found"));
      xodimRepository.delete(xodim);
    }
    public Xodim finById(Long id) {
        return xodimRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Xodim with ID " + id + " not found"));
    }

    public List<Xodim> findAllXodim(){
        List<Xodim> xodimlar=xodimRepository.findAll();
        return xodimlar;
    }

    public Xodim updeteXodim(Long id,Xodim newXodim){
        Xodim xodim = xodimRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Xodim with ID " + id + " not found"));
        xodim.setPasport(newXodim.getPasport());
        xodim.setEmail(newXodim.getEmail());
        xodim.setIshxaqqi(newXodim.getIshxaqqi());
        xodim.setManzil(newXodim.getManzil());
        return xodim;
    }


}
