package br.com.coralcobragames.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class Banner {

    private Long id;
    private String imageUrl;
    private String videoUrl;
    private String title;
    private String subtitle;
    private Games game;

}
