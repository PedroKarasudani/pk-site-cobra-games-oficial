package br.com.coralcobragames.domain.port.api.usecase.teammember;

import br.com.coralcobragames.domain.exceptions.TeamMemberNotFoundException;
import br.com.coralcobragames.domain.model.TeamMember;
import br.com.coralcobragames.domain.port.api.teammember.UpdateTeamMember;
import br.com.coralcobragames.domain.port.spi.TeamMemberPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class UpdateTeamMemberUseCase implements UpdateTeamMember {

    private TeamMemberPort port;

    @Override
    public TeamMember updateById(TeamMember teamMember, Long id) {
        return this.port.findById(id).orElseThrow(() -> new TeamMemberNotFoundException(id));
    }
}
