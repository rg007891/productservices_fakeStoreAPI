package dev.rg.productservice.advice;

import dev.rg.productservice.dtos.ErrorDto;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

@org.springframework.web.bind.annotation.ControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<ErrorDto> errorHandler(){
        ErrorDto errorDto = new ErrorDto();
        errorDto.setMessage("Something went wrong. Please try again.");

        return new ResponseEntity<>(errorDto, HttpStatusCode.valueOf(404));
    }
}
