package br.com.coralcobragames.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ContactMessageDTO {

    private Long id;
    private String name;
    private String email;
    private String message;
    private LocalDateTime createdAt;

}
