package br.com.coralcobragames.domain.exceptions;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id) {
        super("Product with ID: " + id + " not found.");
    }

    public UserNotFoundException(String name) {
        super("Product with Name: " + name + " not found.");
    }
}