package com.todaysoft.cpa.domain.cn.drug;

import com.todaysoft.cpa.domain.entity.Drug;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;

/**
 * @desc:
 * @author: 鱼唇的人类
 * @date: 2017/8/9 10:02
 */
public interface CnDrugRepository extends JpaRepository<Drug,String>{
    @Query(value = "select distinct d.drugId from Drug d where 1=1 and d.createWay=2")
    Set<Integer> findIdByCPA();

    Drug findByDrugId(Integer drugId);
}
