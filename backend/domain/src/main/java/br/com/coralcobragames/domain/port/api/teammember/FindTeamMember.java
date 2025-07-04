package br.com.coralcobragames.domain.port.api.teammember;

import br.com.coralcobragames.domain.model.TeamMember;

import java.util.Optional;

public interface FindTeamMember {

    Optional<TeamMember> findById(Long id);
}
