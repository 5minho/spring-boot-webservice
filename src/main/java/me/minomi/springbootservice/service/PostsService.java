package me.minomi.springbootservice.service;

import lombok.AllArgsConstructor;
import me.minomi.springbootservice.domain.posts.PostsRepository;
import me.minomi.springbootservice.web.PostsMainResponseDto;
import me.minomi.springbootservice.web.PostsSaveRequestsDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2019-03-24.
 */

@AllArgsConstructor
@Service
public class PostsService {
    private PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestsDto dto) {
        return postsRepository.save(dto.toEntity()).getId();
    }

    @Transactional(readOnly = true)
    public List<PostsMainResponseDto> findAllDesc() {
        return postsRepository.findAllDesc()
                .map(PostsMainResponseDto::new)
                .collect(Collectors.toList());
    }
}
