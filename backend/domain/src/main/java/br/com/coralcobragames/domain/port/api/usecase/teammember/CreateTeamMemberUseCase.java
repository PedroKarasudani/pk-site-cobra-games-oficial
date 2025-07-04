package br.com.coralcobragames.domain.port.api.usecase.teammember;

import br.com.coralcobragames.domain.model.TeamMember;
import br.com.coralcobragames.domain.port.api.teammember.CreateTeamMember;
import br.com.coralcobragames.domain.port.spi.TeamMemberPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class CreateTeamMemberUseCase implements CreateTeamMember {

    private TeamMemberPort port;

    @Override
    public TeamMember create(TeamMember teamMember) {
        return this.port.create(teamMember);
    }
}
