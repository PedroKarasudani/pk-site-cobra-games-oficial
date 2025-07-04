package br.com.coralcobragames.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class TeamMember {

    private Long id;
    private String name;
    private String photoUrl;
    private String role;
    private String linkedinUrl;

}
