package br.com.coralcobragames.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Builder
public class ContactMessage {

    private Long id;
    private String name;
    private String email;
    private String message;
    private LocalDateTime createdAt;

}
