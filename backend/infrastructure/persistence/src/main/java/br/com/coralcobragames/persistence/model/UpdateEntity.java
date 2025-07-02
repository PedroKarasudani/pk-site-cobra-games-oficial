package br.com.coralcobragames.persistence.model;

import br.com.coralcobragames.domain.model.Update;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "tb_update")
public class UpdateEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String title;
        private String fullText;
        private LocalDateTime date;
        private String type;
        @ManyToOne
        private TeamMember author;


    public static UpdateEntity fromDomain(Update update, Long id) {
        return UpdateEntity.builder()
                .id(id)
                .title(update.getTitle())
                .fullText(update.getFullText())
                .date(update.getDate())
                .type(update.getType())
                .author(update.getAuthor())
                .build();
    }

    public Update toDomain() {
        return Update.builder()
                .id(this.getId())
                .title(this.getTitle())
                .fullText(this.getFullText())
                .date(this.getDate())
                .type(this.getType())
                .author(this.getAuthor())
                .build();
    }

}
