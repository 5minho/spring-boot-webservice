package me.minomi.springbootservice.web;

import lombok.AllArgsConstructor;
import me.minomi.springbootservice.service.PostsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2019-03-24.
 */

@Controller
@AllArgsConstructor
public class WebController {

    private PostsService postsService;

    @GetMapping("/")
    public String main(Model model) {
        model.addAttribute("posts", postsService.findAllDesc());
        return "main";
    }
}
