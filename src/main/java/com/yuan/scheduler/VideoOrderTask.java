package com.yuan.scheduler;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Random;

@Component
public class VideoOrderTask {

    @Scheduled(fixedRate = 2000)
    public void sum() {

        System.out.println(LocalDateTime.now() + " 当前交易额=" + Math.random());

    }

}
