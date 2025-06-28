package br.com.coralcobragames.persistence.model;

import br.com.coralcobragames.domain.model.ContactMessage;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tb_contact_message")
public class ContactMessageEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String message;
    private LocalDateTime createdAt;

    public static ContactMessageEntity fromDomain(ContactMessage contactMessage, Long id) {
        return ContactMessageEntity.builder()
                .id(id)
                .name(contactMessage.getName())
                .email(contactMessage.getEmail())
                .message(contactMessage.getMessage())
                .createdAt(contactMessage.getCreatedAt())
                .build();
    }

    public ContactMessage toDomain() {
        return ContactMessage.builder()
                .id(this.getId())
                .name(this.getName())
                .email(this.getEmail())
                .message(this.getMessage())
                .createdAt(this.getCreatedAt())
                .build();
    }
}
