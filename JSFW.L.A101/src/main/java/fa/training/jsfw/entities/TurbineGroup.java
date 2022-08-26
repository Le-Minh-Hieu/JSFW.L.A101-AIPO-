package fa.training.jsfw.entities;

import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class TurbineGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer groupId;
    @Column
    private String groupName;
    @Column
    private byte[] objectData;
    @Column
    private int ownerId;
    @Column
    private String groupAliasName;
    @Column
    private String publicFlag;

    @OneToOne
    @JoinColumn(name="postId")
    private EipMPost eipMPost;
}
