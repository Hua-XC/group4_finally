package com.example.group4.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;


@Component
public class WxConfig {

    /**
     * 开发者ID
     */
    public static String appID;
    @Value("${wx.appID}")
    public void setAppID(String appID) {
        this.appID = appID;
    }

//

    /**
     * 商户号
     */
    public static String mchID;
    @Value("${wx.mchID}")
    public void setMchID(String mchID) {
        this.mchID = mchID;
    }


    /**
     * API密钥
     */
    public static String key;
    @Value("${wx.key}")
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * 统一下单-通知链接
     */
    public static String unifiedorderNotifyUrl;
    @Value("${wx.unifiedorder.notifyUrl}")
    public  void setUnifiedorderNotifyUrl(String unifiedorderNotifyUrl) {
        this.unifiedorderNotifyUrl = unifiedorderNotifyUrl;
    }

    /**
     * 连接超时时间
     */
    public static Integer connectionTimeout;
    @Value("${https.connectionTimeout}")
    public void setConnectionTimeout(Integer connectionTimeout) {
        this.connectionTimeout = connectionTimeout;
    }

    /**
     * 连接超时时间
     */
    public static Integer readTimeout;
    @Value("${https.readTimeout}")
    public void setReadTimeout(Integer readTimeout) {
        this.readTimeout = readTimeout;
    }

    //支付map缓存处理
    private static HashMap<String,String> payMap = new HashMap<String,String>();
    public static String getPayMap(String key) {
        return payMap.get(key);
    }
    public static void setPayMap(String key,String value) {
        payMap.put(key,value);
    }


}
