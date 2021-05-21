package com.example.demo.setting;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("app.piyos")
public class Piyos {
    private String piyoNo;
    private String piyo;

    public void setPiyoNo(String piyoNo) {
        this.piyoNo = piyoNo;
    }

    public String getPiyoNo() {
        return piyoNo;
    }

    public String getPiyo() {
        return piyo;
    }

    public void setPiyo(String piyo) {
        this.piyo = piyo;
    }
}