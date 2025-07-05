package br.com.coralcobragames.persistence.model;

import br.com.coralcobragames.domain.model.CompanyInfo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_company_info")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CompanyInfoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private  String name;
    private  String history;
    private  String mission;
    private  String vision;

    public static CompanyInfoEntity fromDomain (CompanyInfo companyInfo, Long id) {
        return CompanyInfoEntity.builder()
                .id(id)
                .name(companyInfo.getName())
                .history(companyInfo.getHistory())
                .mission(companyInfo.getMission())
                .vision(companyInfo.getVision())
                .build();
    }

    public CompanyInfo toDomain(){
        return CompanyInfo.builder()
                .id(this.getId())
                .name(this.getName())
                .history(this.getHistory())
                .mission(this.getMission())
                .vision(this.getVision())
                .build();
    }
}
