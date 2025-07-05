package br.com.coralcobragames.persistence;

import br.com.coralcobragames.domain.model.CompanyInfo;
import br.com.coralcobragames.domain.port.spi.CompanyInfoPort;
import br.com.coralcobragames.persistence.model.CompanyInfoEntity;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CompanyInfoRepositoryAdapter implements CompanyInfoPort {

    private final CompanyInfoRepository repository;

    public CompanyInfoRepositoryAdapter(CompanyInfoRepository repository) {
        this.repository = repository;
    }


    @Override
    public CompanyInfo create(CompanyInfo companyInfo) {
        return this.repository.save(CompanyInfoEntity.fromDomain(companyInfo, null)).toDomain();
    }

    @Override
    public void delete(Long id) {
        this.repository.deleteById(id);
    }

    @Override
    public Optional<CompanyInfo> findById(Long id) {
        return this.repository.findById(id).stream().map(CompanyInfoEntity::toDomain).findFirst();
    }

    @Override
    public CompanyInfo update(CompanyInfo companyInfo, Long id) {
        return this.repository.save(CompanyInfoEntity.fromDomain(companyInfo, id)).toDomain();
    }
}
