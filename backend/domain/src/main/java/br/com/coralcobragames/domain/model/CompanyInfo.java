package br.com.coralcobragames.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class CompanyInfo {

    private Long id;
    private  String name;
    private  String history;
    private  String mission;
    private  String vision;
}
