package br.com.coralcobragames.domain.port.api.usecase.contactmessage;

import br.com.coralcobragames.domain.exceptions.ContactMessageNotFoundException;
import br.com.coralcobragames.domain.port.api.contactmessage.DeleteContactMessage;
import br.com.coralcobragames.domain.port.spi.ContactMessagePort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class DeleteContactMessageUseCase implements DeleteContactMessage {

    private ContactMessagePort port;

    @Override
    public void deleteById(Long id) {
        this.port.findById(id).orElseThrow(() -> new ContactMessageNotFoundException(id));
        this.port.deleteById(id);
    }
}
