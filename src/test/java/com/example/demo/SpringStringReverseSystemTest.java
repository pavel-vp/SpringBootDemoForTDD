package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringStringReverseSystemTest {

    MockMvc mockMvc;

    @Autowired
    SpringStringReverseController controller;

    @Test
    public void systemTest() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
        mockMvc.perform(get("/getreversed?original=123456789"))
                .andExpect(status().isOk())
                .andExpect(content().string("987654321"));
    }

    @Test
    public void test() {
        int i = 2;
        int b = i>>>1;
        System.out.println(b);
    }


}
