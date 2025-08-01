package br.com.coralcobragames.domain.exceptions;

public class BannerNotFoundException extends RuntimeException {
    public BannerNotFoundException(Long id) {
        super("Banner with ID: " + id + " not found.");
    }
}