package br.com.coralcobragames.domain.port.api.companyinfo;

import br.com.coralcobragames.domain.model.CompanyInfo;

import java.util.Optional;

public interface FindCompanyInfo {

    Optional<CompanyInfo> findById(Long id);
}
