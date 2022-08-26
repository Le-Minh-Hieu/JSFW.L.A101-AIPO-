package fa.training.jsfw.dto;

import fa.training.jsfw.entities.EipMCompany;
import fa.training.jsfw.entities.EipMPosition;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class UserDTO {

    private Long userId;
    @Size(min=0,max=32)
    @NotEmpty(message = "Login name cannot be empty.")
    private String loginName;

    @Size(min=0,max=20)
    @NotEmpty(message = "Login name cannot be empty.")
    private String passwordValue;

    @NotEmpty(message = "First name cannot be empty.")
    @Size(min=0,max=99)
    private String firstname;

    @Size(min=0,max=99)
    @NotEmpty(message = "Last name cannot be empty.")
    private String lastname;

    @Size(min=0,max=99)
    @Email(message="Email is in wrong format.")
    @NotEmpty(message = "Email cannot be empty.")
    private String email;

    @NotEmpty(message = "Confirm password cannot be empty.")
    private String confirmValue;

    private LocalDateTime modified;

    private LocalDateTime created;

    private LocalDateTime lastLogin;

    private boolean disabled;

    private byte[] objectData;

    private LocalDateTime passwordChanged;

    private Integer companyId;
    private Integer positionId;

    @Pattern(regexp="(^$|[0-9]{10})", message = "Phone is in wrong format.")
    @NotEmpty(message = "In phone number cannot be empty.")
    private String inTelephone;

    @Pattern(regexp="(^$|[0-9]{10})", message = "Phone is in wrong format.")
    @NotEmpty(message = "Outside phone number cannot be empty.")
    private String outTelephone;

    @NotEmpty(message = "Login name cannot be empty.")
    private String cellularPhone;

    @NotEmpty(message = "Login name cannot be empty.")
    private String cellularMail;

    private String cellularUid;

    @Size(min=0,max=99)
    @NotEmpty(message = "Login name cannot be empty.")
    private String firstNameKana;

    @Size(min=0,max=99)
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
