package fa.training.jsfw.service.impl;

import fa.training.jsfw.dao.DepartmentRepository;
import fa.training.jsfw.dao.EipMPositionRepository;
import fa.training.jsfw.dao.TurbineUserRepository;
import fa.training.jsfw.dto.DepartmentsPositionsDTO;
import fa.training.jsfw.dto.UserDTO;
import fa.training.jsfw.entities.TurbineUser;
import fa.training.jsfw.service.TurbineUserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
class TurbineUserServiceImpl implements TurbineUserService {

    @Autowired
    TurbineUserRepository turbineUserRepository;
    @Autowired
    EipMPositionRepository eipMPositionRepository;
    @Autowired
    DepartmentRepository departmentRepository;
    @Autowired
    ModelMapper mapper;

    @Override
    public TurbineUser create(UserDTO newUser) {
        TurbineUser turbineUser = mapper.map(newUser, TurbineUser.class);
        return turbineUserRepository.save(turbineUser);
    }


    @Override
    public TurbineUser findById(Integer id) {
        return turbineUserRepository.findById(id).get();
    }

    @Override
    public List<TurbineUser> getAll() {
        return turbineUserRepository.findAll();
    }

    @Override
    public void delete(Integer id) {
        turbineUserRepository.deleteById(id);
    }

    @Override
    public DepartmentsPositionsDTO getDepartmentsPositions() {
        DepartmentsPositionsDTO departmentsPositionsDTO = new DepartmentsPositionsDTO();
        departmentsPositionsDTO.setDepartments(departmentRepository.findAll());
        departmentsPositionsDTO.setPositions(eipMPositionRepository.findAll());
        return departmentsPositionsDTO;
    }
}
