package br.com.coralcobragames.domain.port.api.contactmessage;

import br.com.coralcobragames.domain.model.ContactMessage;

public interface UpdateContactMessage {

    ContactMessage update(ContactMessage contactMessage, Long id);

}
