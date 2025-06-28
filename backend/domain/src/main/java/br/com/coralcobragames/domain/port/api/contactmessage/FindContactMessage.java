package br.com.coralcobragames.domain.port.api.contactmessage;

import br.com.coralcobragames.domain.model.ContactMessage;

import java.util.Optional;

public interface FindContactMessage {

    Optional<ContactMessage> findById(Long id);
}
