package br.com.meli.desafio_spring.dto.exception;

public class ExceptionDTO {
    private String message;

    public ExceptionDTO(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
