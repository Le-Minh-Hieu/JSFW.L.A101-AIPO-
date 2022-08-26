package fa.training.jsfw.controller;

import fa.training.jsfw.entities.Department;
import fa.training.jsfw.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/departments")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @GetMapping
    List<Department> getAll() {
        return departmentService.getAll();
    }
}
