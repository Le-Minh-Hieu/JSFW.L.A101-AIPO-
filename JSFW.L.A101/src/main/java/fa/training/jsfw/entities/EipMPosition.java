package fa.training.jsfw.entities;

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
    private int sort;
    @Column
    private LocalDateTime createDate;
    @Column
    private LocalDateTime updateDate;
    @OneToMany(mappedBy = "eipMPosition")
    List<TurbineUser> turbineUsers;
}
