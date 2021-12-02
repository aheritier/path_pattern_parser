package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = AController.class)
abstract class AControllerTestBase {
    @Autowired
    private MockMvc mvc;

    @Test
    void testIt() throws Exception {
        mvc.perform(get("/api/test/{path}", "12345%2Ffoo.zip"))
                .andExpect(status().is2xxSuccessful());
    }

}
