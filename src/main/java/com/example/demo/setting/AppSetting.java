package com.example.demo.setting;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties("app")
public class AppSetting {
    private String hoge;
    private List<String> piyos;

    public String getHoge() {
        return hoge;
    }
    public List<String> getPiyos() {
        return piyos;
    }

    public void setHoge(String hoge) {
        this.hoge = hoge;
    }

    public void setPiyos(List<String> piyos) {
        this.piyos = piyos;
    }
}
