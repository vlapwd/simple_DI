package com.example.demo.setting;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties(prefix="app")
public class AppSetting {
    private String hoge;
    private List<Piyos> piyos;

    public String getHoge() {
        return hoge;
    }
    public List<Piyos> getPiyos() {
        return piyos;
    }

    public void setHoge(String hoge) {
        this.hoge = hoge;
    }

    public void setPiyos(List<Piyos> piyos) {
        this.piyos = piyos;
    }


}
