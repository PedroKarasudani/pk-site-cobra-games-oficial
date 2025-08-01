package br.com.coralcobragames.domain.exceptions;

public class TeamMemberNotFoundException extends RuntimeException {
    public TeamMemberNotFoundException(Long id) {
        super("Team member with ID: " + id + " not found.");
    }
}