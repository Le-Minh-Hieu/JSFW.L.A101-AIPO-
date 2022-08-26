package fa.training.jsfw.service;

import fa.training.jsfw.entities.EipMPosition;
import fa.training.jsfw.entities.EipMPost;

import java.util.List;

public interface EipMPostService {
    Integer create(EipMPost eipMPost);
    EipMPost findById(Integer id);
    List<EipMPost> getAll();
    void delete(Integer id);
}
