package me.minomi.springbootservice.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.stream.Stream;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2019-03-24.
 */

public interface PostsRepository extends JpaRepository<Posts, Long> {
    @Query("SELECT p FROM Posts p ORDER BY p.id DESC ")
    Stream<Posts> findAllDesc();
}
