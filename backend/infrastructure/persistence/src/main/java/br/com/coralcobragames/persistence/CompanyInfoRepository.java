package br.com.coralcobragames.persistence;

import br.com.coralcobragames.persistence.model.CompanyInfoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyInfoRepository extends JpaRepository<CompanyInfoEntity, Long> {
}
