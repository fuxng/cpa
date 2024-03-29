package com.todaysoft.cpa.domain.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * @desc:
 * @author: 鱼唇的人类
 * @date: 2017/8/9 9:56
 */
@Entity
@Table(name = "kt_drug_international_brand")
public class DrugInternationalBrand implements Serializable {
    private static final long serialVersionUID = 1L;
    private String internationalBrandKey;
    private String drugKey;
    private int drugId;
    private String internationalBrand;
    private String brandCompany;

    @Id
    @Column(name = "international_brand_key", nullable = false, length = 64)
    public String getInternationalBrandKey() {
        return internationalBrandKey;
    }

    public void setInternationalBrandKey(String internationalBrandKey) {
        this.internationalBrandKey = internationalBrandKey;
    }

    @Basic
    @Column(name = "drug_key", nullable = true, length = 64)
    public String getDrugKey() {
        return drugKey;
    }

    public void setDrugKey(String drugKey) {
        this.drugKey = drugKey;
    }

    @Basic
    @Column(name = "drug_id", nullable = false)
    public int getDrugId() {
        return drugId;
    }

    public void setDrugId(int drugId) {
        this.drugId = drugId;
    }

    @Basic
    @Column(name = "international_brand", nullable = false, length = 200)
    public String getInternationalBrand() {
        return internationalBrand;
    }

    public void setInternationalBrand(String internationalBrand) {
        this.internationalBrand = internationalBrand;
    }

    @Basic
    @Column(name = "brand_company", nullable = true, length = 500)
    public String getBrandCompany() {
        return brandCompany;
    }

    public void setBrandCompany(String brandCompany) {
        this.brandCompany = brandCompany;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DrugInternationalBrand)) return false;
        DrugInternationalBrand that = (DrugInternationalBrand) o;
        return getDrugId() == that.getDrugId() &&
                Objects.equals(getDrugKey(), that.getDrugKey()) &&
                Objects.equals(getInternationalBrand(), that.getInternationalBrand()) &&
                Objects.equals(getBrandCompany(), that.getBrandCompany());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getDrugKey(), getDrugId(), getInternationalBrand(), getBrandCompany());
    }
}
