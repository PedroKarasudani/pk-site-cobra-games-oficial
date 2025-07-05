package br.com.coralcobragames.web.converter;

import br.com.coralcobragames.domain.model.CompanyInfo;
import br.com.coralcobragames.web.model.CompanyInfoDTO;

public class CompanyInfoConverter {

    public CompanyInfoDTO toDTO (CompanyInfo companyInfo){
        return CompanyInfoDTO.builder()
                .id(companyInfo.getId())
                .name(companyInfo.getName())
                .history(companyInfo.getHistory())
                .mission(companyInfo.getMission())
                .vision(companyInfo.getVision())
                .build();
    }

    public CompanyInfo toDomain (CompanyInfoDTO companyInfoDto){
        return CompanyInfo.builder()
                .id(companyInfoDto.getId())
                .name(companyInfoDto.getName())
                .history(companyInfoDto.getHistory())
                .mission(companyInfoDto.getMission())
                .vision(companyInfoDto.getVision())
                .build();
    }
}
