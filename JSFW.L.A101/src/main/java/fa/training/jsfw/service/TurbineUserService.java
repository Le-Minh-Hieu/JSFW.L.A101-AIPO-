package fa.training.jsfw.service;

import fa.training.jsfw.dto.DepartmentsPositionsDTO;
import fa.training.jsfw.dto.UserDTO;
import fa.training.jsfw.entities.TurbineUser;

import java.util.List;

public interface TurbineUserService {
    TurbineUser create(UserDTO newUser);
    TurbineUser findById(Integer id);
    List<TurbineUser> getAll();
    void delete(Integer id);

    DepartmentsPositionsDTO getDepartmentsPositions();
}
