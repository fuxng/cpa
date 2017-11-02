package com.todaysoft.cpa;

import com.todaysoft.cpa.service.MainService;
import com.todaysoft.cpa.statistics.StatisticsService;
import com.todaysoft.cpa.total.CountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @desc: 启动运行
 * @author: 鱼唇的人类
 * @date: 2017/8/9 9:10
 */
@Component
@Order(1)
public class Start implements CommandLineRunner {
    private static Logger logger= LoggerFactory.getLogger(Start.class);
    @Autowired
    private MainService mainService;
    @Autowired
    private CountService countService;
    @Autowired
    private StatisticsService statisticsService;
    @Override
    public void run(String... strings) throws IOException, InterruptedException {
//        mainService.init();
//        mainService.manager();
//        countService.countProtein();
//        countService.countMedicationPlan();
//        countService.countClinicalTrial(46130,90000);
//        countService.countClinicalTrial(90000,135000);
//        countService.countClinicalTrial(135000,180000);
//        countService.countClinicalTrial(180000,0);
//        countService.countGene();
//        countService.countDrug();
//        statisticsService.statisticsGene();
//        statisticsService.statisticsDrug();
//        statisticsService.statisticsProtein();
//        statisticsService.statisticsRegimen();
        statisticsService.statisticsClinicalTrail();
        logger.info("<<<<<<<<<启动完成>>>>>>>>>");
    }
}
