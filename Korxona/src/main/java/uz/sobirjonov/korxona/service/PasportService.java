package uz.sobirjonov.korxona.service;

import org.springframework.stereotype.Service;
import uz.sobirjonov.korxona.entity.Pasport;
import uz.sobirjonov.korxona.repository.PasportRepository;

@Service
public class PasportService {
    private final PasportRepository pasportRepository;

    public PasportService(PasportRepository pasportRepository) {
        this.pasportRepository = pasportRepository;
    }
    public Pasport addPasport(Pasport pasport){
        return pasportRepository.save(pasport);
    }
}
