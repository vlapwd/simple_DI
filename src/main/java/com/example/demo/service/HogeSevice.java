package com.example.demo.service;

import com.example.demo.setting.AppSetting;
import com.example.demo.util.CulcUtil;
import com.example.demo.util.HogeUtil;
import org.springframework.stereotype.Service;

@Service
public class HogeSevice {
    private final HogeUtil hogeUtil;
    private final CulcUtil culcUtil;
    private final AppSetting appSetting;

    public HogeSevice(HogeUtil hogeUtil, CulcUtil culcUtil, AppSetting appSetting) {
        this.hogeUtil = hogeUtil;
        this.culcUtil = culcUtil;
        this.appSetting = appSetting;
    }

    public void simple(){
        System.out.println(hogeUtil.SIMPLE_STR);
    }

    public Integer add(Integer a, Integer b){
        return culcUtil.add(a, b);
    }

    public void yaml(){
        System.out.println(appSetting.getHoge());
        appSetting.getPiyos().forEach(System.out::println);
    }
}
