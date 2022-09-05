package com.solarsdev.book.springboot.domain.posts;

import com.solarsdev.book.springboot.domain.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Posts extends BaseTimeEntity {

    @Id // PK
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment
    private Long id;

    @Column(length = 500, nullable = false) // coulmn 속성 (길이 500, cannot be null)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false) // coulmn 속성 (TEXT타입, 원래 String은 VARCHAR(255)가 기본
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
