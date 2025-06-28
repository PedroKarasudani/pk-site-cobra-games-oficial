package br.com.coralcobragames.domain.port.api.usecase.contactmessage;

import br.com.coralcobragames.domain.model.ContactMessage;
import br.com.coralcobragames.domain.port.api.contactmessage.FindContactMessage;
import br.com.coralcobragames.domain.port.spi.ContactMessagePort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
@NoArgsConstructor
public class FindContactMessageUseCase implements FindContactMessage {

    private ContactMessagePort port;

    @Override
    public Optional<ContactMessage> findById(Long id) {
        return this.port.findById(id);
    }
}
