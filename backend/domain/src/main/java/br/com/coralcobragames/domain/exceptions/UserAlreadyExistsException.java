package br.com.coralcobragames.domain.exceptions;

public class UserAlreadyExistsException extends RuntimeException {
    public UserAlreadyExistsException(String name) {
        super("User with " + name + " already exists.");
    }
}
