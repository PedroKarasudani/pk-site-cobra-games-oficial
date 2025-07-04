package br.com.coralcobragames.web.config;

import br.com.coralcobragames.domain.port.api.teammember.CreateTeamMember;
import br.com.coralcobragames.domain.port.api.teammember.DeleteTeamMember;
import br.com.coralcobragames.domain.port.api.teammember.FindTeamMember;
import br.com.coralcobragames.domain.port.api.teammember.UpdateTeamMember;
import br.com.coralcobragames.domain.port.api.usecase.teammember.CreateTeamMemberUseCase;
import br.com.coralcobragames.domain.port.api.usecase.teammember.DeleteTeamMemberUseCase;
import br.com.coralcobragames.domain.port.api.usecase.teammember.FindTeamMemberUseCase;
import br.com.coralcobragames.domain.port.api.usecase.teammember.UpdateTeamMemberUseCase;
import br.com.coralcobragames.domain.port.spi.TeamMemberPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseTeamMemberConfig {

    @Bean
    public CreateTeamMember createTeamMember(TeamMemberPort port) {
        return new CreateTeamMemberUseCase(port);
    }

    @Bean
    public FindTeamMember findTeamMember(TeamMemberPort port) {
        return new FindTeamMemberUseCase(port);
    }

    @Bean
    public DeleteTeamMember deleteTeamMember(TeamMemberPort port) {
        return new DeleteTeamMemberUseCase(port);
    }

    @Bean
    public UpdateTeamMember updateTeamMember(TeamMemberPort port) {
        return new UpdateTeamMemberUseCase(port);
    }
}
