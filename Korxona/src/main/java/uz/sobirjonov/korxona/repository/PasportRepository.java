package uz.sobirjonov.korxona.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.sobirjonov.korxona.entity.Pasport;

@Repository
public interface PasportRepository extends JpaRepository<Pasport,Long> {
}
