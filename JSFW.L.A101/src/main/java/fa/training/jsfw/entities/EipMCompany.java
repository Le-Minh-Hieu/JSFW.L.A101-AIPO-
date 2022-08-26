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
public class EipMCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer companyId;
    @Column
    private String companyName;
    @Column
    private String companyNameKana;
    @Column
    private String zipcode;
    @Column
    private String address;
    @Column
    private String telephone;
    @Column
    private String faxNumber;
    @Column
    private String url;
    @Column
    private String ipaddress;
    @Column
    private Integer port;
    @Column
    private String ipaddressInternal;
    @Column
    private Integer portInternal;
    @Column
    private LocalDateTime createDate;
    @Column
    private LocalDateTime updateDate;

    @OneToMany(mappedBy = "eipMCompany")
    List<TurbineUser> turbineUsers;

    @OneToMany(mappedBy = "eipMCompany")
    List<EipMPost> eipMPosts;
}
