package com.todaysoft.cpa.test;

import com.alibaba.fastjson.*;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.*;

/**
 * @desc:
 * @author: 鱼唇的人类
 * @date: 2017/8/11 10:54
 */
public class ErrorJsonAnalyze {
    private static String token="eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1c2VySWQiOjc0MSwic2VydmljZUlkIjo0LCJpYXQiOjE0OTMxMzEwNjl9.Q0Y8ty9eZ-s2MvMk4VmQW68ZWoxemFbKCOShxPzGMd4";
    private static String url="https://cpa.myknowtions.com/v2/proteins/H0UI37";
    public static void main(String[] args) throws IOException {
        Connection.Response response=Jsoup.connect(url)
                .data("drugId","360")
                .userAgent("'User-Agent':'Mozilla/5.0 (Windows; U; Windows NT 6.1; en-US; rv:1.9.1.6) Gecko/20091201 Firefox/3.5.6'") // 设置 User-Agent
                .header("Authorization", token)
                .header("Accept", "application/test")
                .ignoreContentType(true)
                .timeout(120000)
                .maxBodySize(0)
                .execute();
        System.out.println(response.body());
//        String jsonStr=doc.body().toString().replaceAll("<.*>|<!--|-->","");
        String jsonStr = response.body();
//        System.out.println(jsonStr);
//        System.out.println(jsonStr.length());
//        System.out.println(jsonStr.substring(jsonStr.length()));
        JSONObject jsonObject=JSON.parseObject(jsonStr);
        System.out.println(jsonObject.toJSONString());
    }
}
