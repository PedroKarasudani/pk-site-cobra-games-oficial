package br.com.coralcobragames.domain.exceptions;

public class GamesNotFoundException extends RuntimeException {
    public GamesNotFoundException(Long id) {
        super("Game with ID: " + id + " not found.");
    }
}