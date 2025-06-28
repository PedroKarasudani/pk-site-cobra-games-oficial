package br.com.coralcobragames.domain.port.api.contactmessage;

import br.com.coralcobragames.domain.model.ContactMessage;

public interface CreateContactMessage {

    ContactMessage create(ContactMessage contactMessage);
}
