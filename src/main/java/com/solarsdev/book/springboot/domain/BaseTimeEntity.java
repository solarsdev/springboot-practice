package com.solarsdev.book.springboot.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass // JPA Entity 클래스에서 이 클래스를 상속받으면 필드들도 칼럼으로 인식
@EntityListeners(AuditingEntityListener.class) // 클래스에 Auditing 기능을 포함
public class BaseTimeEntity {

    @CreatedDate // 엔티티 생성 시 시간 자동 업데이트
    private LocalDateTime createdDate;

    @LastModifiedDate // 엔티티 수정 시 시간 자동 업데이트
    private LocalDateTime modifiedDate;

}
