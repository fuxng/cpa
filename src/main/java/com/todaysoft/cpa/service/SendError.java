package com.todaysoft.cpa.service;

import com.todaysoft.cpa.utils.DateUtil;
import com.todaysoft.cpa.utils.ExceptionInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.util.*;

/**
 * @desc: 定时发送错误信息
 * @author: 鱼唇的人类
 * @date: 2017/8/10 14:22
 */
@Component
public class SendError {
    private static Logger logger= LoggerFactory.getLogger(SendError.class);
    @Value("${spring.mail.username}")
    private String sendFrom;
    @Value("${exception.mail.username}")
    private String sendTo;
    @Value("${logging.path}")
    private String errorPath;
    @Autowired
    private JavaMailSender mailSender;

    /**
     * @desc: 发送昨天的错误日志
     *  每天9:00发送
     *  如果昨天的日志为空就不发
     * @author: 鱼唇的人类
     */
    @Scheduled(cron = "0 0 9 * * ?")
    public void sendError(){
        logger.info("【定时邮件任务】--开始发送CPA错误信息");
        try {
            MimeMessage mimeMessage = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true,"utf-8");
            helper.setFrom(sendFrom);
            helper.setTo(sendTo);
            helper.setSubject("【CPA 错误日志】-"+ DateUtil.yesterday());
            helper.setText("CPA错误日志，详情请查看附件！谢谢！");
            File dir=new File(errorPath);
            String regex="error-"+DateUtil.yesterday()+".*";
            List<File> fileList=new ArrayList<>();
            if (dir.exists()){
                File[]files=dir.listFiles();
                if (files!=null&&files.length>0){
                    Arrays.stream(files)
                            .filter(file -> file.exists() && file.length() > 0 && file.getName().matches(regex))
                            .forEach(fileList::add);
                }
            }else {
                logger.error("【定时邮件任务】--找不到日志目录");
            }
            if (fileList.size() > 0){
                for (File aFileList : fileList) {
                    helper.addAttachment("cpa-" + aFileList.getName(), aFileList);
                }
                mailSender.send(mimeMessage);
                logger.info("【定时任务】--邮件发送成功");
            }
        }catch (Exception e){
            logger.error("【定时邮件任务】--发送邮件失败",e);
        }finally {
            logger.info("【定时任务】--CPA错误信息邮件发送完成");
        }
    }
}
