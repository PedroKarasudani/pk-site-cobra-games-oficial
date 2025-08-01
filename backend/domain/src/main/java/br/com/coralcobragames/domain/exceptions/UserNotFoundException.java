package br.com.coralcobragames.domain.exceptions;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(Long id) {
        super("User with ID: " + id + " not found.");
    }

    public UserNotFoundException(String name) {
        super("User with Name: " + name + " not found.");
    }
}