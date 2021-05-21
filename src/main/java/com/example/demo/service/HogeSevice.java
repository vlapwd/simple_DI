package com.example.demo.service;

import com.example.demo.util.HogeUtil;
import org.springframework.stereotype.Service;

@Service
public class HogeSevice {
    private final HogeUtil hogeUtil;

    public HogeSevice(HogeUtil hogeUtil) {
        this.hogeUtil = hogeUtil;
    }

    public void simple(){
        System.out.println(hogeUtil.SIMPLE_STR);
    }
}
