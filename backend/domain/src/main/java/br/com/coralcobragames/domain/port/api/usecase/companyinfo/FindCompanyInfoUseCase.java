package br.com.coralcobragames.domain.port.api.usecase.companyinfo;

import br.com.coralcobragames.domain.model.CompanyInfo;
import br.com.coralcobragames.domain.port.api.companyinfo.FindCompanyInfo;
import br.com.coralcobragames.domain.port.spi.CompanyInfoPort;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
@NoArgsConstructor
public class FindCompanyInfoUseCase implements FindCompanyInfo {

    private CompanyInfoPort port;

    @Override
    public Optional<CompanyInfo> findById(Long id) {
        return this.port.findById(id);
    }
}
