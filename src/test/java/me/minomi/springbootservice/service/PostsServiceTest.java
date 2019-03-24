package me.minomi.springbootservice.service;

import me.minomi.springbootservice.domain.posts.Posts;
import me.minomi.springbootservice.domain.posts.PostsRepository;
import me.minomi.springbootservice.web.PostsMainResponseDto;
import me.minomi.springbootservice.web.PostsSaveRequestsDto;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2019-03-24.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class PostsServiceTest {

    @Autowired
    private PostsService postsService;

    @Autowired
    private PostsRepository postsRepository;

    @After
    public void cleanup() {
        postsRepository.deleteAll();
    }

    @Test
    public void Dto데이터가_posts_테이블에_저장된다() {
        // given
        PostsSaveRequestsDto dto = PostsSaveRequestsDto.builder()
                .title("test title")
                .content("test content")
                .author("test author")
                .build();

        // when
        postsService.save(dto);

        // then
        Posts posts = postsRepository.findAll().get(0);
        assertThat(posts.getAuthor()).isEqualTo(dto.getAuthor());
        assertThat(posts.getContent()).isEqualTo(dto.getContent());
        assertThat(posts.getTitle()).isEqualTo(dto.getTitle());
    }

    @Test
    public void Dto데이터가_잘_출력된다() {
        List<PostsMainResponseDto> posts = postsService.findAllDesc();
        assertThat(posts.get(0).getTitle()).isEqualTo("테스트2");
        assertThat(posts.get(1).getTitle()).isEqualTo("테스트1");
    }

}