package fa.training.jsfw.dao;

import fa.training.jsfw.entities.TurbineGroup;
import fa.training.jsfw.entities.TurbineUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TurbineUserRepository extends JpaRepository<TurbineUser, Integer> {

    TurbineUser save(TurbineUser entity);
}
