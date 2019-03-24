package me.minomi.springbootservice.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2019-03-24.
 */

public interface PostsRepository extends JpaRepository<Posts, Long> {
}
