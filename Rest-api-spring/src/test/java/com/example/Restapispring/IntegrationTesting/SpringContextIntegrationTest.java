package com.example.Restapispring.IntegrationTesting;

import com.example.Restapispring.configuration.WebConfig;
import org.junit.jupiter.api.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
//we put the MVC configuration and the beans for perform the integration testing
@ContextConfiguration(
        classes = {WebConfig.class, PersistenceConfig.class },
        loader = AnnotationConfigContextLoader.class
)
public class SpringContextIntegrationTest {
    @Test
    public void contextLoads(){

    }
}
