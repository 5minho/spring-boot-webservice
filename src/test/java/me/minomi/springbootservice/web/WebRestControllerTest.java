package me.minomi.springbootservice.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2019-03-25.
 */

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment =  SpringBootTest.WebEnvironment.RANDOM_PORT)
public class WebRestControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void Profile_확인() {
        String profile = this.testRestTemplate.getForObject("/profile", String.class);

        assertThat(profile).isEqualTo("local");
    }

}