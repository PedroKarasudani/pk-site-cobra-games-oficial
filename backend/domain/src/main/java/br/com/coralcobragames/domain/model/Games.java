package br.com.coralcobragames.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Builder
public class Games {

    private Long id;
    private String title;
    private String description;
    private String platform;
    private String linkDownload;
    private LocalDateTime releaseDate;
    private Banner banner;
}
