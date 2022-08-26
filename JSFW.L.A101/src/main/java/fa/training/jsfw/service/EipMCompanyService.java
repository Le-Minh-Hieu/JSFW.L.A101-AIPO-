package fa.training.jsfw.service;

import fa.training.jsfw.entities.EipMCompany;

import java.util.List;

public interface EipMCompanyService {
    Integer create(EipMCompany eipMCompany);
    EipMCompany findById(Integer id);
    List<EipMCompany> getAll();
    void delete(Integer id);
}
