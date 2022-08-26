package fa.training.jsfw.dto;

import fa.training.jsfw.entities.Department;
import fa.training.jsfw.entities.EipMPosition;
import lombok.*;

import java.util.List;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DepartmentsPositionsDTO {
    private List<Department> departments;
    private List<EipMPosition> positions;
 }
