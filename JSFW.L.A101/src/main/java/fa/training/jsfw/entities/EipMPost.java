package fa.training.jsfw.entities;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class EipMPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int postId;
    @Column
    private int companyId;
    @Column
    private String postName;
    @Column
    private String zipcode;
    @Column
    private String address;
    @Column
    private String inTelephone;
    @Column
    private String outTelephone;
    @Column
    private String faxNumber;
    @Column
    private String groupName;
    @Column
    private int sort;
    @Column
    private LocalDateTime createDate;
    @Column
    private LocalDateTime updateDate;
    @OneToOne(mappedBy = "eipMPost")
    private TurbineGroup turbineGroup;
    @ManyToOne
    @JoinColumn(name="companyId", insertable=false, updatable=false)
    private EipMCompany eipMCompany;
}
