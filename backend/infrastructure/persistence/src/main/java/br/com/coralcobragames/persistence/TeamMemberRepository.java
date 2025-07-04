package br.com.coralcobragames.persistence;

import br.com.coralcobragames.persistence.model.TeamMemberEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamMemberRepository extends JpaRepository<TeamMemberEntity, Long> {
}
