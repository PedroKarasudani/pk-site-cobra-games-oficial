package br.com.coralcobragames.domain.port.spi;

import br.com.coralcobragames.domain.model.CompanyInfo;

import java.util.Optional;

public interface CompanyInfoPort {
    CompanyInfo create(CompanyInfo companyInfo);
    void delete(Long id);
    Optional<CompanyInfo> findById(Long id);
    CompanyInfo update(CompanyInfo companyInfo, Long id);
}
