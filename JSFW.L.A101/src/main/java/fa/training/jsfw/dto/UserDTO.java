package fa.training.jsfw.dto;

import fa.training.jsfw.entities.EipMCompany;
import fa.training.jsfw.entities.EipMPosition;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class UserDTO {

    private Long userId;
    @NotEmpty(message = "Login name cannot be empty.")
    private String loginName;
    @NotEmpty(message = "Login name cannot be empty.")
    private String passwordValue;
    @NotEmpty(message = "Login name cannot be empty.")
    private String firstname;
    @NotEmpty(message = "Login name cannot be empty.")
    private String lastname;
    @NotEmpty(message = "Login name cannot be empty.")
    private String email;
    @NotEmpty(message = "Login name cannot be empty.")
    private String confirmValue;

    private LocalDateTime modified;

    private LocalDateTime created;

    private LocalDateTime lastLogin;

    private boolean disabled;

    private byte[] objectData;

    private LocalDateTime passwordChanged;

    private Integer companyId;

    private Integer positionId;
    @NotEmpty(message = "Login name cannot be empty.")
    private String inTelephone;
    @NotEmpty(message = "Login name cannot be empty.")
    private String outTelephone;
    @NotEmpty(message = "Login name cannot be empty.")
    private String cellularPhone;
    @NotEmpty(message = "Login name cannot be empty.")
    private String cellularMail;

    private String cellularUid;
    @NotEmpty(message = "Login name cannot be empty.")
    private String firstNameKana;
    @NotEmpty(message = "Login name cannot be empty.")
    private String lastNameKana;

    private byte[] photo;

    private byte[] photoSmartphone;

    private boolean hasPhoto;

    private LocalDateTime photoModifiedSmartphone;

    private boolean hasPhotoSmartphone;

    private boolean tutorialForbid;
    private Integer migrateVersion;
    private Integer createdUserId;
    private Integer updatedUserId;

    private EipMCompany eipMCompany;

    private EipMPosition eipMPosition;
}
