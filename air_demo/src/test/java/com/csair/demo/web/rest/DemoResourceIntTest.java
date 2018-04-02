package com.csair.demo.web.rest;

import com.csair.demo.AirApp;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
/**
 * Test class for the Demo REST controller.
 *
 * @see DemoResource
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = AirApp.class)
public class DemoResourceIntTest {

    private MockMvc restMockMvc;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        DemoResource demoResource = new DemoResource();
        restMockMvc = MockMvcBuilders
            .standaloneSetup(demoResource)
            .build();
    }

    /**
    * Test demo
    */
    @Test
    public void testDemo() throws Exception {
        restMockMvc.perform(post("/api/demo/demo"))
            .andExpect(status().isOk());
    }
    /**
    * Test api
    */
    @Test
    public void testApi() throws Exception {
        restMockMvc.perform(post("/api/demo/api"))
            .andExpect(status().isOk());
    }

}
