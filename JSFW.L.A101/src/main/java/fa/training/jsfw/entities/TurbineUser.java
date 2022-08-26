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
public class TurbineUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long userId;
    @Column
    private String loginName;
    @Column
    private String passwordValue;
    @Column
    private String firstname;
    @Column
    private String lastname;
    @Column
    private String email;
    @Column
    private String confirmValue;
    @Column
    private LocalDateTime modified;
    @Column
    private LocalDateTime created;
    @Column
    private LocalDateTime lastLogin;
    @Column
    private boolean disabled;
    @Column
    private byte[] objectData;
    @Column
    private LocalDateTime passwordChanged;
    @Column
    private Integer companyId;
    @Column
    private Integer positionId;
    @Column
    private String inTelephone;
    @Column
    private String outTelephone;
    @Column
    private String cellularPhone;
    @Column
    private String cellularMail;
    @Column
    private String cellularUid;
    @Column
    private String firstNameKana;
    @Column
    private String lastNameKana;
    @Column
    private byte[] photo;
    @Column
    private byte[] photoSmartphone;
    @Column
    private boolean hasPhoto;
    @Column
    private LocalDateTime photoModifiedSmartphone;
    @Column
    private boolean hasPhotoSmartphone;
    @Column
    private boolean tutorialForbid;
    @Column
    private Integer migrateVersion;
    @Column
    private Integer createdUserId;
    @Column
    private Integer updatedUserId;
    @Column
    private String departmentName;
    @ManyToOne
    @JoinColumn(name="companyId", insertable=false, updatable=false)
    private EipMCompany eipMCompany;

    @ManyToOne
    @JoinColumn(name="positionId", insertable=false, updatable=false)
    private EipMPosition eipMPosition;
}
