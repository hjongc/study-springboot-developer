package me.hjongc.springbootdeveloper.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

@Entity // 엔터티로 지정
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Article {

    @Id // id필드를 기본키로 지정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 기본키 자동으로 1씩 증가
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "author", nullable = false)
    private String author;

    @Column(name="title", nullable = false)
    private String title;

    @Column(name="content", nullable = false)
    private String content;

    @CreatedDate // 엔터티가 생성될 때 생성시간 저장
    @Column(name="created_at")
    private LocalDateTime createdAt;

    @LastModifiedDate
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @Builder // 빌더 패턴으로 객체 생성
    public Article(String author, String title, String content) {
        this.author = author;
        this.title = title;
        this.content = content;
    }

    public void update(String title, String content) {
        this.title = title;
        this.content = content;
    }

//    protected Article() { // 기본 생성자
//    }

//    // getter
//    public Long getId() {
//        return id;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getContent() {
//        return content;
//    }
}
