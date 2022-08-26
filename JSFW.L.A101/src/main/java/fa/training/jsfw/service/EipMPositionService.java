package fa.training.jsfw.service;

import fa.training.jsfw.entities.EipMCompany;
import fa.training.jsfw.entities.EipMPosition;

import java.util.List;

public interface EipMPositionService {
    Integer create(EipMPosition eipMPosition);
    EipMPosition findById(Integer id);
    List<EipMPosition> getAll();
    void delete(Integer positionId);
}
