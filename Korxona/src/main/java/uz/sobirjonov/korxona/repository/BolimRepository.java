package uz.sobirjonov.korxona.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.sobirjonov.korxona.entity.Bolim;
import uz.sobirjonov.korxona.entity.Lavozim;

public interface BolimRepository extends JpaRepository<Bolim, Lavozim> {
}
