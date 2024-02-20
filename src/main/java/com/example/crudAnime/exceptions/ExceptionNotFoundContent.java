package com.example.crudAnime.exceptions;

public class ExceptionNotFoundContent extends RuntimeException{

    public ExceptionNotFoundContent() {
        super("Searched content not found in the database");
    }

    public ExceptionNotFoundContent(String message) {
        super(message);
    }

}
