package fa.training.jsfw.service;

import fa.training.jsfw.entities.EipMPost;
import fa.training.jsfw.entities.TurbineGroup;

import java.util.List;

public interface TurbineGroupService {
    Integer create(TurbineGroup turbineGroup);
    TurbineGroup findById(Integer id);
    List<TurbineGroup> getAll();
    void delete(Integer id);
}
