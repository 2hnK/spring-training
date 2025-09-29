package com.sample.springtraining.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity
@Table(name = "USERS")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Long id;

    @NotBlank
    @Column(name = "NAME", nullable = false)
    private String name;

    @NotBlank
    @Column(name = "NICKNAME", nullable = false)
    private String nickname;
    
    @Email
    @NotBlank
    @Column(name = "EMAIL", nullable = false)
    private String email;

    @NotBlank
    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @Column(name = "CREATED_AT", nullable = false)
    private LocalDateTime createdAt;

    @PrePersist
    public void prePersist() {
        if (this.createdAt == null) {
            this.createdAt = LocalDateTime.now();
        }
    }

    @Builder(access = AccessLevel.PUBLIC)
    private User(String name, String nickname, String email, String password, LocalDateTime createdAt) {
        this.name = name;
        this.nickname = nickname;
        this.email = email;
        this.password = password;
        this.createdAt = createdAt;
    }

}
