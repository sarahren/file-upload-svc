package com.ren.ping.fileuploadsvc;

import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.nio.charset.Charset;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class FileUploadSvcControllerUnitTest {

    private static MediaType MEDIA_TYPE_JSON;

    @Autowired
    private MockMvc mockMvc;

    @Before
    public void setUpJsonMediaType() {
        MEDIA_TYPE_JSON = new MediaType(MediaType.APPLICATION_JSON.getType(), MediaType.APPLICATION_JSON.getSubtype(), Charset.forName("utf8"));
    }

    @Test
    public void whenPostHttpRequesttoCustomers_thenStatusOK() throws Exception {

        JSONObject file = new JSONObject();
        file.put("fileName","image.jpg");
        file.put("size",12345l);
        String requestJson = file.toString();

        this.mockMvc
                .perform(MockMvcRequestBuilders.post("/files")
                        .contentType(MEDIA_TYPE_JSON)
                        .content(requestJson)
                )
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void whenGetHttpRequesttoCustomers_thenStatusOK() throws Exception {
        this.mockMvc
                .perform(MockMvcRequestBuilders.get("/files"))
                .andExpect(MockMvcResultMatchers.content().contentType(MEDIA_TYPE_JSON))
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

}
