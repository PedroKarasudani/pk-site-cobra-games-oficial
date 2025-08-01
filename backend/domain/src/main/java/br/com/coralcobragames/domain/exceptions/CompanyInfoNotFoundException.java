package br.com.coralcobragames.domain.exceptions;

public class CompanyInfoNotFoundException extends RuntimeException {
    public CompanyInfoNotFoundException(Long id) {
        super("Company info with ID: " + id + " not found.");
    }
}