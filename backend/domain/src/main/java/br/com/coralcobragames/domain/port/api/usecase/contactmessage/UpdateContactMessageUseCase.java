package br.com.coralcobragames.domain.port.api.usecase.contactmessage;

import br.com.coralcobragames.domain.model.ContactMessage;
import br.com.coralcobragames.domain.port.api.contactmessage.UpdateContactMessage;
import br.com.coralcobragames.domain.port.spi.ContactMessagePort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class UpdateContactMessageUseCase implements UpdateContactMessage {

    private ContactMessagePort port;

    @Override
    public ContactMessage update(ContactMessage contactMessage, Long id) {
        return this.port.update(contactMessage, id);
    }
}
