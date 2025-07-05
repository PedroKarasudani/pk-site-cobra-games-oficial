package br.com.coralcobragames.web.facade;

import br.com.coralcobragames.domain.port.api.companyinfo.CreateCompanyInfo;
import br.com.coralcobragames.domain.port.api.companyinfo.DeleteCompanyInfo;
import br.com.coralcobragames.domain.port.api.companyinfo.FindCompanyInfo;
import br.com.coralcobragames.domain.port.api.companyinfo.UpdateCompanyInfo;
import br.com.coralcobragames.domain.port.spi.CompanyInfoPort;
import br.com.coralcobragames.web.converter.CompanyInfoConverter;
import br.com.coralcobragames.web.model.CompanyInfoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompanyInfoFacade {

    private final CompanyInfoConverter converter = new CompanyInfoConverter();

    @Autowired
    private CreateCompanyInfo createCompanyInfo;
    @Autowired
    private DeleteCompanyInfo deleteCompanyInfo;
    @Autowired
    private UpdateCompanyInfo updateCompanyInfo;
    @Autowired
    private FindCompanyInfo findCompanyInfo;

    public CompanyInfoDTO create(CompanyInfoDTO companyInfoDTO) {
        return this.converter.toDTO(this.createCompanyInfo.create(this.converter.toDomain(companyInfoDTO)));
    }

    public void delete(Long id) {
         this.deleteCompanyInfo.delete(id);
    }

    public CompanyInfoDTO update(CompanyInfoDTO companyInfoDTO, Long id) {
        return this.converter.toDTO(this.updateCompanyInfo.update(this.converter.toDomain(companyInfoDTO), id));
    }

    public CompanyInfoDTO findById(Long id) {
        return this.converter.toDTO(this.findCompanyInfo.findById(id).get());
    }
}
