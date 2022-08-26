package fa.training.jsfw.service;

import fa.training.jsfw.dto.UserDTO;
import fa.training.jsfw.entities.Department;
import fa.training.jsfw.entities.TurbineUser;

import java.util.List;

public interface DepartmentService {
    Department create(Department department);
    Department findById(Integer id);
    List<Department> getAll();
    void delete(Integer id);
}
