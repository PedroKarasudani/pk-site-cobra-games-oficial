package br.com.coralcobragames.domain.exceptions;

public class UpdateNotFoundException extends RuntimeException {
    public UpdateNotFoundException(Long id) {
        super("Update with ID: " + id + " not found.");
    }
}