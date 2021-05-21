package com.example.demo.service;

import com.example.demo.util.CulcUtil;
import com.example.demo.util.HogeUtil;
import org.springframework.stereotype.Service;

@Service
public class HogeSevice {
    private final HogeUtil hogeUtil;
    private final CulcUtil culcUtil;

    public HogeSevice(HogeUtil hogeUtil, CulcUtil culcUtil) {
        this.hogeUtil = hogeUtil;
        this.culcUtil = culcUtil;
    }

    public void simple(){
        System.out.println(hogeUtil.SIMPLE_STR);
    }

    public Integer add(Integer a, Integer b){
        return culcUtil.add(a, b);
    }
}
