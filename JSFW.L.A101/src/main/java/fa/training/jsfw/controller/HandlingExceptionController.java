package fa.training.jsfw.controller;


import fa.training.jsfw.dto.ErrorMsgDTO;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestControllerAdvice(basePackages = "fa.training.jsfw.controller")
public class HandlingExceptionController {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ErrorMsgDTO handleValidationExceptions(MethodArgumentNotValidException ex ) {
        Map<String, String> errors = new HashMap<>();

        ex.getBindingResult().getAllErrors().forEach( (error) -> {
            String fieldName = ((FieldError) error).getField();
            String errorMessage = error.getDefaultMessage();
            errors.put(fieldName, errorMessage);
        });

        return ErrorMsgDTO.builder().message("Validation")
                                    .timestamp(LocalDateTime.now())
                                    .datas(List.of(errors)).build();
    }

}
