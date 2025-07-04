package br.com.coralcobragames.domain.port.api.usecase.teammember;

import br.com.coralcobragames.domain.port.api.teammember.DeleteTeamMember;
import br.com.coralcobragames.domain.port.spi.TeamMemberPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class DeleteTeamMemberUseCase implements DeleteTeamMember {

    private TeamMemberPort port;

    @Override
    public void delete(Long id) {
        this.port.delete(id);
    }
}
