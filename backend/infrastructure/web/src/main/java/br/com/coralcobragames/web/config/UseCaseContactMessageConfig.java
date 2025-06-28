package br.com.coralcobragames.web.config;

import br.com.coralcobragames.domain.port.api.contactmessage.CreateContactMessage;
import br.com.coralcobragames.domain.port.api.contactmessage.DeleteContactMessage;
import br.com.coralcobragames.domain.port.api.contactmessage.FindContactMessage;
import br.com.coralcobragames.domain.port.api.contactmessage.UpdateContactMessage;
import br.com.coralcobragames.domain.port.api.usecase.contactmessage.CreateContactMessageUseCase;
import br.com.coralcobragames.domain.port.api.usecase.contactmessage.DeleteContactMessageUseCase;
import br.com.coralcobragames.domain.port.api.usecase.contactmessage.FindContactMessageUseCase;
import br.com.coralcobragames.domain.port.api.usecase.contactmessage.UpdateContactMessageUseCase;
import br.com.coralcobragames.domain.port.spi.ContactMessagePort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseContactMessageConfig {

    @Bean
    public CreateContactMessage createContactMessage(ContactMessagePort contactMessagePort){
        return new CreateContactMessageUseCase(contactMessagePort);
    }

    @Bean
    public FindContactMessage findContactMessage(ContactMessagePort contactMessagePort) {
        return new FindContactMessageUseCase(contactMessagePort);
    }

    @Bean
    public UpdateContactMessage updateContactMessage(ContactMessagePort contactMessagePort) {
        return new UpdateContactMessageUseCase(contactMessagePort);
    }

    @Bean
    public DeleteContactMessage deleteContactMessage(ContactMessagePort contactMessagePort) {
        return new DeleteContactMessageUseCase(contactMessagePort);
    }

}
