package br.com.coralcobragames.domain.port.api.usecase.teammember;

import br.com.coralcobragames.domain.model.TeamMember;
import br.com.coralcobragames.domain.port.api.teammember.FindTeamMember;
import br.com.coralcobragames.domain.port.spi.TeamMemberPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
@NoArgsConstructor
public class FindTeamMemberUseCase implements FindTeamMember {

    private TeamMemberPort port;

    @Override
    public Optional<TeamMember> findById(Long id) {
        return this.port.findById(id);
    }
}
