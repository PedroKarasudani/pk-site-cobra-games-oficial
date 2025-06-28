package br.com.coralcobragames.web.converter;

import br.com.coralcobragames.domain.model.ContactMessage;
import br.com.coralcobragames.web.model.ContactMessageDTO;

public class ContactMessageConverter {

    public ContactMessageDTO toDTO(ContactMessage contactMessage) {
        return ContactMessageDTO.builder()
                .id(contactMessage.getId())
                .name(contactMessage.getName())
                .email(contactMessage.getEmail())
                .message(contactMessage.getMessage())
                .createdAt(contactMessage.getCreatedAt())
                .build();
    }

    public ContactMessage toDomain(ContactMessageDTO contactMessageDTO) {
        return ContactMessage.builder()
                .id(contactMessageDTO.getId())
                .name(contactMessageDTO.getName())
                .email(contactMessageDTO.getEmail())
                .message(contactMessageDTO.getMessage())
                .createdAt(contactMessageDTO.getCreatedAt())
                .build();
    }
}
