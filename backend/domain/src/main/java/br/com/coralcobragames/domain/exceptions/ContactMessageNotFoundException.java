package br.com.coralcobragames.domain.exceptions;

public class ContactMessageNotFoundException extends RuntimeException {
    public ContactMessageNotFoundException(Long id) {
        super("Contact message with ID: " + id + " not found.");
    }
}