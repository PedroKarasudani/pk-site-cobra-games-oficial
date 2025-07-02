package br.com.coralcobragames.web.config;

import br.com.coralcobragames.domain.port.api.usecase.update.CreateUpdateUseCase;
import br.com.coralcobragames.domain.port.api.usecase.update.DeleteUpdateUseCase;
import br.com.coralcobragames.domain.port.api.usecase.update.FindUpdateUseCase;
import br.com.coralcobragames.domain.port.api.usecase.update.UpdateUpdateUseCase;
import br.com.coralcobragames.domain.port.spi.UpdatePort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseUpdateConfig {

    @Bean
    public CreateUpdateUseCase createUpdateUseCase(UpdatePort updatePort) {
        return new CreateUpdateUseCase(updatePort);
    }

    @Bean
    public UpdateUpdateUseCase updateUpdateUseCase(UpdatePort updatePort) {
        return new UpdateUpdateUseCase(updatePort);
    }

    @Bean
    public DeleteUpdateUseCase deleteUpdateUseCase(UpdatePort updatePort) {
        return new DeleteUpdateUseCase(updatePort);
    }

    @Bean
    public FindUpdateUseCase findUpdateUseCase(UpdatePort updatePort) {
        return new FindUpdateUseCase(updatePort);
    }
}
