package me.minomi.springbootservice.web;

import lombok.AllArgsConstructor;
import me.minomi.springbootservice.domain.posts.PostsRepository;
import me.minomi.springbootservice.service.PostsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2019-03-24.
 */

@RestController
@AllArgsConstructor
public class WebRestController {

    private PostsService postsService;

    @GetMapping("/hello")
    public String hello() {
        return "HelloWorld";
    }

    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsSaveRequestsDto dto) {
        postsService.save(dto);
    }
}
