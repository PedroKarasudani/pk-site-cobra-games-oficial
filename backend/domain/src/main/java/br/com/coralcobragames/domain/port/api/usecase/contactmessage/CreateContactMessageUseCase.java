package br.com.coralcobragames.domain.port.api.usecase.contactmessage;

import br.com.coralcobragames.domain.model.ContactMessage;
import br.com.coralcobragames.domain.port.api.contactmessage.CreateContactMessage;
import br.com.coralcobragames.domain.port.spi.ContactMessagePort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class CreateContactMessageUseCase implements CreateContactMessage {

    private ContactMessagePort port;

    @Override
    public ContactMessage create(ContactMessage contactMessage) {
        return this.port.create(contactMessage);
    }
}
