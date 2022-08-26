package fa.training.jsfw.dto;

import lombok.*;

import java.time.LocalDateTime;
import java.util.List;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ErrorMsgDTO {
    private String message;
    private LocalDateTime timestamp;
    private List<Object> datas;
    private Object data;
}
