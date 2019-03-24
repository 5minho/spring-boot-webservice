package me.minomi.springbootservice.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

/**
 * IDE : IntelliJ IDEA
 * Created by minho on 2019-03-24.
 */

@Getter
@MappedSuperclass // JPA Entity 클래스들이 BaseTimeEntity 를 상속할 경우 createdDate, modifiedDate 도 컬럼으로 인식하게 한다.
@EntityListeners(AuditingEntityListener.class)
public class BaseTimeEntity {
    @CreatedDate
    private LocalDateTime createdDate;

    @LastModifiedDate
    private LocalDateTime modifiedDate;
}
