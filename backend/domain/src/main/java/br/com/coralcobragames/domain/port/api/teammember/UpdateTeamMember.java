package br.com.coralcobragames.domain.port.api.teammember;

import br.com.coralcobragames.domain.model.TeamMember;

public interface UpdateTeamMember {

    TeamMember updateById(TeamMember teamMember, Long id);
}
