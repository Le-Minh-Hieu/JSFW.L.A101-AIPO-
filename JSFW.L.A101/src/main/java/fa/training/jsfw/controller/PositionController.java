package fa.training.jsfw.controller;

import fa.training.jsfw.entities.Department;
import fa.training.jsfw.entities.EipMPosition;
import fa.training.jsfw.service.DepartmentService;
import fa.training.jsfw.service.EipMPositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/api/v1/positions")
public class PositionController {
    @Autowired
    EipMPositionService eipMPositionService;

    @GetMapping
    List<EipMPosition> getAll() {
        return eipMPositionService.getAll();
    }
}
