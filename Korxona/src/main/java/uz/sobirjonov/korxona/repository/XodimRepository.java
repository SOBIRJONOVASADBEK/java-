package uz.sobirjonov.korxona.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.sobirjonov.korxona.entity.Xodim;
@Repository
public interface XodimRepository extends JpaRepository<Xodim,Long> {

}
