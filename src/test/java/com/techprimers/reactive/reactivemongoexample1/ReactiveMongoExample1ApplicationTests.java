package com.techprimers.reactive.reactivemongoexample1;

import com.techprimers.reactive.reactivemongoexample1.resource.EmployeeResource;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ReactiveMongoExample1ApplicationTests {


    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    EmployeeResource employeeResource;

    @Test
    public void testRestCall() {
        Assert.assertNotNull(employeeResource);
    }

    @Test
    public void greetingShouldReturnDefaultMessage() throws Exception {
//        (this.restTemplate.getForObject("http://localhost:" + port + "/rest/employee/all",
//                String.class)).contains("Hello World");
        String message = this.restTemplate.getForObject("http://localhost:" + port + "/rest/employee/all",
                String.class);
        System.out.println(message);
    }

}
