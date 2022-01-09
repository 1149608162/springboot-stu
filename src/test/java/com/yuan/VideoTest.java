package com.yuan;

import com.yuan.domain.Video;
import com.yuan.service.VideoService;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.List;

@RunWith(SpringRunner.class) // 底层用junit SpringJunit4CLassRunner
@SpringBootTest(classes = {DemoProjectApplication.class})
@AutoConfigureMockMvc
public class VideoTest {

    @Autowired
    private VideoService videoService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testVideoListApi() throws Exception {
        MvcResult mvcResult = mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/pub/video/list"))
                .andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
        int status = mvcResult.getResponse().getStatus();
        System.out.println(status);

        String result = mvcResult.getResponse().getContentAsString();
        System.out.println(result);
    }

    @Before
    public void testOne() {
        System.out.println("before");
    }

//    @Test
//    public void testTwo() {
//        System.out.println("testing");
//        TestCase.assertEquals(1, 3);
//    }

    @Test
    public void testVideoList() {
        List<Video> videoList = videoService.listVideo();
        TestCase.assertTrue(videoList.size() > 0);
    }

    @After
    public void testTree() {
        System.out.println("after");
    }
}
