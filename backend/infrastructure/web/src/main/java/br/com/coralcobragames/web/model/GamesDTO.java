package br.com.coralcobragames.web.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GamesDTO {

    private Long id;
    private String title;
    private String description;
    private String platform;
    private String linkDownload;
    private LocalDateTime releaseDate;
    private BannerDTO bannerDTO;
}