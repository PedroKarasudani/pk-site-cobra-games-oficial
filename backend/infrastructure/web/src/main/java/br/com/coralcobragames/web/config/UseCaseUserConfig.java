package br.com.coralcobragames.web.config;

import br.com.coralcobragames.domain.port.api.usecase.user.CreateUserUseCase;
import br.com.coralcobragames.domain.port.api.usecase.user.DeleteUserUseCase;
import br.com.coralcobragames.domain.port.api.usecase.user.FindUserUseCase;
import br.com.coralcobragames.domain.port.api.usecase.user.UpdateUserUseCase;
import br.com.coralcobragames.domain.port.api.user.CreateUser;
import br.com.coralcobragames.domain.port.api.user.DeleteUser;
import br.com.coralcobragames.domain.port.api.user.FindUser;
import br.com.coralcobragames.domain.port.api.user.UpdateUser;
import br.com.coralcobragames.domain.port.spi.UserPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseUserConfig {

    @Bean
    public CreateUser createUser(UserPort userPort) {
        return new CreateUserUseCase(userPort);
    }

    @Bean
    public DeleteUser deleteUser(UserPort userPort) {
        return new DeleteUserUseCase(userPort);
    }

    @Bean
    public FindUser findUser(UserPort userPort) {
        return new FindUserUseCase(userPort);
    }

    @Bean
    public UpdateUser updateUser(UserPort userPort) {
        return new UpdateUserUseCase(userPort);
    }
}
