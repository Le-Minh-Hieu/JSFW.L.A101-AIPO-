package fa.training.jsfw.dao;

import fa.training.jsfw.entities.EipMPosition;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EipMPositionRepository extends JpaRepository<EipMPosition, Long> {
    @Override
    List<EipMPosition> findAll();
}
