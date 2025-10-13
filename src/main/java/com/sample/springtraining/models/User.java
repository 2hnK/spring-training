package com.sample.springtraining.models;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.Comment;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@Entity
@Table(name = "USERS")
@Comment("사용자 정보 테이블")
public class User extends BaseEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    @Comment("사용자 고유 ID")
    private Long id;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Bookmark> bookmarks = new ArrayList<>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Authority> authorities = new ArrayList<>();

    @NotBlank
    @Column(name = "USERNAME", nullable = false, unique = true)
    @Comment("로그인 계정 ID")
    private String username;

    @NotBlank
    @Column(name = "PASSWORD", nullable = false)
    @Comment("계정 비밀번호")
    private String password;

    @NotBlank
    @Column(name = "NICKNAME", nullable = false)
    @Comment("닉네임")
    private String nickname;

    @Email
    @NotBlank
    @Column(name = "EMAIL", nullable = false)
    @Comment("이메일 주소")
    private String email;

    @Builder
    public User(String username, String password, String nickname, String email) {
        this.username = username;
        this.password = password;
        this.nickname = nickname;
        this.email = email;
    }

}
