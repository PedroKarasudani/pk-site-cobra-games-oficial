package br.com.coralcobragames.web.config;

import br.com.coralcobragames.domain.port.api.update.CreateUpdate;
import br.com.coralcobragames.domain.port.api.update.DeleteUpdate;
import br.com.coralcobragames.domain.port.api.update.FindUpdate;
import br.com.coralcobragames.domain.port.api.update.UpdateUpdate;
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
    public CreateUpdate createUpdateUseCase(UpdatePort updatePort) {
        return new CreateUpdateUseCase(updatePort);
    }

    @Bean
    public UpdateUpdate updateUpdateUseCase(UpdatePort updatePort) {
        return new UpdateUpdateUseCase(updatePort);
    }

    @Bean
    public DeleteUpdate deleteUpdateUseCase(UpdatePort updatePort) {
        return new DeleteUpdateUseCase(updatePort);
    }

    @Bean
    public FindUpdate findUpdateUseCase(UpdatePort updatePort) {
        return new FindUpdateUseCase(updatePort);
    }
}
