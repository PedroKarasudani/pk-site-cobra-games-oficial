package br.com.coralcobragames.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Builder
public class Update {

    private Long id;
    private String title;
    private String fullText;
    private LocalDateTime date;
    private String type;
    private TeamMember author;
}
