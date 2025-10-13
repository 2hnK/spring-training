package com.sample.springtraining.models;

import org.hibernate.annotations.Comment;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "CHAPTERS")
@Comment("강좌 챕터 테이블")
@Getter
@Setter
@NoArgsConstructor
public class Chapter extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CHAPTER_ID")
    @Comment("챕터 고유 ID")
    private Long id;

    @NotNull(message = "소속 강좌는 필수입니다")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COURSE_ID", nullable = false)
    private Course course;

    @NotBlank(message = "챕터 제목은 필수입니다")
    @Column(name = "TITLE", nullable = false)
    @Comment("챕터 제목")
    private String title;

    @Column(name = "CONTENT", length = 5000)
    @Comment("챕터 내용")
    private String content;

    @NotNull(message = "챕터 순서는 필수입니다")
    @Min(value = 1, message = "챕터 순서는 1 이상이어야 합니다")
    @Column(name = "ORDER_INDEX", nullable = false)
    @Comment("챕터 정렬 순서")
    private Integer orderIndex;

    @Builder
    public Chapter(Course course, String title, String content, Integer orderIndex) {
        this.course = course;
        this.title = title;
        this.content = content;
        this.orderIndex = orderIndex;
    }
}
