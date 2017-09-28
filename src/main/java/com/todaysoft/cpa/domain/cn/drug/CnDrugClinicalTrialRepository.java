package com.todaysoft.cpa.domain.cn.drug;

import com.todaysoft.cpa.domain.entity.DrugClinicalTrial;
import com.todaysoft.cpa.domain.entity.DrugClinicalTrialPK;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @desc:
 * @author: 鱼唇的人类
 * @date: 2017/9/6 13:52
 */
public interface CnDrugClinicalTrialRepository extends JpaRepository<DrugClinicalTrial,DrugClinicalTrialPK>{
}
