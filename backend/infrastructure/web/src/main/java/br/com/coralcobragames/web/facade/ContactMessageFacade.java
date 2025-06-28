package br.com.coralcobragames.web.facade;

import br.com.coralcobragames.domain.port.api.contactmessage.CreateContactMessage;
import br.com.coralcobragames.domain.port.api.contactmessage.DeleteContactMessage;
import br.com.coralcobragames.domain.port.api.contactmessage.FindContactMessage;
import br.com.coralcobragames.domain.port.api.contactmessage.UpdateContactMessage;
import br.com.coralcobragames.web.converter.ContactMessageConverter;
import br.com.coralcobragames.web.model.ContactMessageDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactMessageFacade {

    @Autowired
    private CreateContactMessage createContactMessage;
    @Autowired
    private FindContactMessage findContactMessage;
    @Autowired
    private UpdateContactMessage updateContactMessage;
    @Autowired
    private DeleteContactMessage deleteContactMessage;

    private final ContactMessageConverter converter = new ContactMessageConverter();

    public ContactMessageDTO create(ContactMessageDTO contactMessageDTO) {
        return this.converter.toDTO(this.createContactMessage.create(this.converter.toDomain(contactMessageDTO)));
    }

    public ContactMessageDTO findById(Long id) {
        return this.converter.toDTO(this.findContactMessage.findById(id).get());
    }

    public ContactMessageDTO update(ContactMessageDTO contactMessageDTO, Long id) {
        return this.converter.toDTO(this.updateContactMessage.update(this.converter.toDomain(contactMessageDTO), id));
    }

    public void delete(Long id) {
        this.deleteContactMessage.deleteById(id);
    }
}
