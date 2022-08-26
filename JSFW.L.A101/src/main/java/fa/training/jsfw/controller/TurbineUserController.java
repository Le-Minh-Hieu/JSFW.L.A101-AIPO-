package fa.training.jsfw.controller;

import fa.training.jsfw.dto.DepartmentsPositionsDTO;
import fa.training.jsfw.dto.UserDTO;
import fa.training.jsfw.entities.TurbineUser;
import fa.training.jsfw.service.TurbineUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class TurbineUserController {
    @Autowired
    TurbineUserService turbineUserService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    List<TurbineUser> all() {
        return turbineUserService.getAll();
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    TurbineUser newEmployee(@Valid @RequestBody UserDTO newUser) {
        return turbineUserService.create(newUser);
    }
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    TurbineUser one(@PathVariable Integer id) {
        return turbineUserService.findById(id);
    }
    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    TurbineUser update(@Valid @RequestBody UserDTO updatedUser) {
        return turbineUserService.create(updatedUser);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    void delete(@PathVariable Integer id) {
        turbineUserService.delete(id);
    }
}
