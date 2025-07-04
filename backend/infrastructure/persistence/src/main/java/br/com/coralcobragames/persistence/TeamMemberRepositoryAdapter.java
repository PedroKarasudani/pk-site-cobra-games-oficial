package br.com.coralcobragames.persistence;


import br.com.coralcobragames.domain.model.TeamMember;
import br.com.coralcobragames.domain.port.spi.TeamMemberPort;
import br.com.coralcobragames.persistence.model.TeamMemberEntity;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class TeamMemberRepositoryAdapter implements TeamMemberPort {

    private final TeamMemberRepository teamMemberRepository;

    public TeamMemberRepositoryAdapter(TeamMemberRepository teamMemberRepository) {
        this.teamMemberRepository = teamMemberRepository;
    }


    @Override
    public TeamMember create(TeamMember teamMember) {
        return this.teamMemberRepository.save(TeamMemberEntity.fromDomain(teamMember, null)).toDomain();
    }

    @Override
    public void delete(Long id) {
        this.teamMemberRepository.deleteById(id);
    }

    @Override
    public Optional<TeamMember> findById(Long id) {
        return this.teamMemberRepository.findById(id).stream().map(TeamMemberEntity::toDomain).findFirst();
    }

    @Override
    public TeamMember updateById(TeamMember teamMember, Long id) {
        return this.teamMemberRepository.save(TeamMemberEntity.fromDomain(teamMember, id)).toDomain();
    }
}
