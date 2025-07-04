package br.com.coralcobragames.persistence.model;

import br.com.coralcobragames.domain.model.TeamMember;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tb_team_member")
public class TeamMemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String photoUrl;
    private String role;
    private String linkedinUrl;


    public static TeamMemberEntity fromDomain (TeamMember teamMember, Long id) {
        return TeamMemberEntity.builder()
                .id(id)
                .name(teamMember.getName())
                .photoUrl(teamMember.getPhotoUrl())
                .role(teamMember.getRole())
                .linkedinUrl(teamMember.getLinkedinUrl())
                .build();
    }

    public TeamMember toDomain(){
        return TeamMember.builder()
                .id(this.id)
                .name(this.getName())
                .photoUrl(this.getPhotoUrl())
                .role(this.getRole())
                .linkedinUrl(this.getLinkedinUrl())
                .build();
    }
}
