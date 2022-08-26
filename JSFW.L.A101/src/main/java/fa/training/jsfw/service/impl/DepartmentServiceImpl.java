package fa.training.jsfw.service.impl;

import fa.training.jsfw.dao.DepartmentRepository;
import fa.training.jsfw.entities.Department;
import fa.training.jsfw.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentServiceImpl implements DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public Department create(Department department) {
        return null;
    }

    @Override
    public Department findById(Integer id) {
        return null;
    }

    @Override
    public List<Department> getAll() {
        return departmentRepository.findAll();
    }

    @Override
    public void delete(Integer id) {

    }
}
