package com.todaysoft.cpa.domain.en.drug;

import com.todaysoft.cpa.domain.entity.DrugProductIngredient;
import com.todaysoft.cpa.domain.entity.DrugProductIngredientPK;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @desc:
 * @author: 鱼唇的人类
 * @date: 2017/11/20 11:40
 */
public interface DrugProductIngredientRepository extends JpaRepository<DrugProductIngredient,DrugProductIngredientPK> {
}
