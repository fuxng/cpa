package com.todaysoft.cpa.domain.cn.evidence;

import com.todaysoft.cpa.domain.entity.Evidence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;

/**
 * @desc:
 * @author: 鱼唇的人类
 * @date: 2017/9/14 15:38
 */
public interface CnEvidenceRepository extends JpaRepository<Evidence,String> {
    @Query("select e.evidenceId from Evidence e where e.createdWay=2")
    Set<Integer> findIdByCPA();

    Evidence findByEvidenceId(Integer evidenceId);
}
