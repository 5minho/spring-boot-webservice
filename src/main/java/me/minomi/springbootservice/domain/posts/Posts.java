package me.minomi.springbootservice.domain.posts;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.minomi.springbootservice.domain.BaseTimeEntity;

import javax.persistence.*;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2019-03-24.
 */

@NoArgsConstructor(access = AccessLevel.PROTECTED) // 기본 생성자 protected 로 접근 지정
@Getter // 게터 생성
@Entity // 언더스코어 네이밍으로 매칭
public class Posts extends BaseTimeEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
