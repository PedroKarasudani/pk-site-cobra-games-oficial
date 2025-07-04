package br.com.coralcobragames.domain.port.api.teammember;

import br.com.coralcobragames.domain.model.TeamMember;

public interface CreateTeamMember {

    TeamMember create(TeamMember teamMember);
}
