package br.com.coralcobragames.domain.port.spi;

import br.com.coralcobragames.domain.model.TeamMember;

import java.util.Optional;

public interface TeamMemberPort {

    TeamMember create(TeamMember teamMember);
    void delete(Long id);
    Optional<TeamMember> findById(Long id);
    TeamMember updateById(TeamMember teamMember, Long id);
}
