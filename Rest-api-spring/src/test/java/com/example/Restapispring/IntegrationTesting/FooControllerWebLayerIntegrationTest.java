package com.example.Restapispring.IntegrationTesting;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@WebMvcTest(FooController.class)
public class FooControllerWebLayerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private IFooService service;

    @Test()
    public void whenTestMvcController_thenRetrieveExpectedResult() throws Exception {

        this.mockMvc.perform(get("/foos")
                .andExpect(...);
    }
}
