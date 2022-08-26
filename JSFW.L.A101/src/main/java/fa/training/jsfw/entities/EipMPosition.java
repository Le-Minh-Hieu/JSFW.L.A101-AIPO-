package fa.training.jsfw.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class EipMPosition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer positionId;
    @Column
    private String positionName;
    @Column
    private Integer sort;
    @Column
    private LocalDateTime createDate;
    @Column
    private LocalDateTime updateDate;
    @OneToMany(mappedBy = "eipMPosition")
    @JsonManagedReference
    List<TurbineUser> turbineUsers;
}
