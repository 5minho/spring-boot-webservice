package me.minomi.springbootservice.web;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import me.minomi.springbootservice.domain.posts.Posts;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2019-03-24.
 */

@Getter
@Setter
@NoArgsConstructor
public class PostsSaveRequestsDto {
    private String title;
    private String content;
    private String author;

    public Posts toEntity() {
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}
