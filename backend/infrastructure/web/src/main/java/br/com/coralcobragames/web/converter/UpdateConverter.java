package br.com.coralcobragames.web.converter;

import br.com.coralcobragames.domain.model.Update;
import br.com.coralcobragames.web.model.UpdateDTO;

public class UpdateConverter {

    public UpdateDTO toDTO(Update update) {
        return UpdateDTO.builder()
                .id(update.getId())
                .title(update.getTitle())
                .fullText(update.getFullText())
                .date(update.getDate())
                .type(update.getType())
                .author(update.getAuthor())
                .build();
    }

    public Update toDomain (UpdateDTO updateDTO) {
        return Update.builder()
                .id(updateDTO.getId())
                .title(updateDTO.getTitle())
                .fullText(updateDTO.getFullText())
                .date(updateDTO.getDate())
                .type(updateDTO.getType())
                .author(updateDTO.getAuthor())
                .build();
    }
}
