package com.yuan.controller;

import com.yuan.domain.Video;
import com.yuan.service.VideoService;
import com.yuan.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 视频控制器
 */
@RestController
@RequestMapping("/api/v1/pub/video")
public class VideoController {

    @Autowired
    private VideoService videoService;

//    @RequestMapping(value = "list", method = RequestMethod.GET)
    @GetMapping("list")
    public JsonData list() {
        List<Video> videos = videoService.listVideo();
        return JsonData.buildSuccess(videos);
    }

    @PostMapping("save_video_chapter")
    public JsonData saveVideo(@RequestBody Video video) {

        System.out.println(video.toString());

        return JsonData.buildSuccess("");
    }

}
