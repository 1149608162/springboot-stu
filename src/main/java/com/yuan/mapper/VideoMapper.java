package com.yuan.mapper;

import com.yuan.domain.Video;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class VideoMapper {

    private static Map<Integer, Video> videoMap = new HashMap<>();

    static {
        videoMap.put(1,new Video(1, "java基础课程"));
        videoMap.put(2,new Video(2, "springBoot2.x"));
        videoMap.put(3,new Video(3, "微服务全家桶"));
        videoMap.put(4,new Video(4, "微信支付"));
        videoMap.put(5,new Video(5, "大厂"));
    }

    public List<Video> listVideo() {
        List<Video> videos = new ArrayList<>();
        videos.addAll(videoMap.values());
        return videos;
    }

}
