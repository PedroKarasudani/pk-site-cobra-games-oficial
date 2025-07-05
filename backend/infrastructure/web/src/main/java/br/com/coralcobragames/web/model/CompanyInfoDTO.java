package br.com.coralcobragames.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class CompanyInfoDTO {

    private Long id;
    private  String name;
    private  String history;
    private  String mission;
    private  String vision;
}
