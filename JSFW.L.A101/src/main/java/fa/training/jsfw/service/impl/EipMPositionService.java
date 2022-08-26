package fa.training.jsfw.service.impl;

import fa.training.jsfw.dao.EipMPositionRepository;
import fa.training.jsfw.entities.EipMPosition;
import fa.training.jsfw.service.EipMPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
class EipMPositionServiceImpl implements EipMPositionService {
    @Autowired
    EipMPositionRepository eipMPositionRepository;
    @Override
    public Integer create(EipMPosition eipMPosition) {
        return null;
    }

    @Override
    public EipMPosition findById(Integer id) {
        return null;
    }

    @Override
    public List<EipMPosition> getAll() {
        return eipMPositionRepository.findAll();
    }

    @Override
    public void delete(Integer id) {

    }

}
