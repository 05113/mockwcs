package com.quicktron.wcsmock;

import ThreadTest.LogTest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MockService {
    private static final Logger log = LoggerFactory.getLogger(MockService.class);
    @RequestMapping("/mockJob")
    public void mockJob(@RequestBody String mockJob){
        System.out.println("输出mockJob:"+mockJob);
        log.info(mockJob);
    }
    @RequestMapping("/mockAgv")
    public void mockAgv(@RequestBody String mockAgv){
        System.out.println("输出mockAgv"+mockAgv);
        log.info(mockAgv);
    }
    @RequestMapping("/mockPoint")
    public void mockPoint(@RequestBody String mockPoint){
        System.out.println("mockPoint"+mockPoint);
        log.info(mockPoint);
    }


}
