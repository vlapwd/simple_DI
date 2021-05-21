package com.example.demo.controller;

import com.example.demo.service.HogeSevice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {
    private final HogeSevice hogeSevice;

    //コンストラクターインジェクション
    //@Autowired省略
    public RootController(HogeSevice hogeSevice) {
        this.hogeSevice = hogeSevice;
    }

    @GetMapping
    public void hogeService(){
        hogeSevice.simple();
    }
}
