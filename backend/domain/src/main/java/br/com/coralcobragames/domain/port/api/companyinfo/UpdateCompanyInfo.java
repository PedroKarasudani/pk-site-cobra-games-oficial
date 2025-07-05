package br.com.coralcobragames.domain.port.api.companyinfo;

import br.com.coralcobragames.domain.model.CompanyInfo;

public interface UpdateCompanyInfo {

    CompanyInfo update(CompanyInfo companyInfo, Long id);
}
