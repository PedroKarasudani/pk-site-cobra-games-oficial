package br.com.coralcobragames.domain.port.spi;

import br.com.coralcobragames.domain.model.ContactMessage;

import java.util.Optional;

public interface ContactMessagePort {

    ContactMessage create(ContactMessage contactMessage);

    void deleteById(Long id);

    Optional<ContactMessage> findById(Long id);

    ContactMessage update(ContactMessage contactMessage, Long id);
}
