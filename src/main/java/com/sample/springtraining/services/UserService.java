package com.sample.springtraining.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.querydsl.core.types.OrderSpecifier;
import com.querydsl.jpa.impl.JPAQuery;
import com.sample.springtraining.models.QUser;
import com.sample.springtraining.models.User;
import com.sample.springtraining.repositories.UserRepository;

import jakarta.persistence.EntityManager;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final EntityManager entityManager;

    @Autowired
    public UserService(UserRepository userRepository, EntityManager entityManager) {
        this.userRepository = userRepository;
        this.entityManager = entityManager;
    }

    public List<User> findAllUsers() {
        Iterable<User> iterable = userRepository.findAll(Sort.unsorted());
        List<User> users = new ArrayList<>();

        for (User user : iterable) {
            users.add(user);
        }
        return users;
    }

    public User findUserByNickname(String nickname) {
        QUser user = QUser.user;
        JPAQuery<User> query = new JPAQuery<>(entityManager);

        return query.select(user)
                .from(user)
                .where(user.nickname.eq(nickname))
                .fetchOne();
    }

    public List<User> findUsersOrderByEmail() {
        OrderSpecifier<String> descOrder = QUser.user.email.desc();
        Iterable<User> iterable = userRepository.findAll(descOrder);
        return StreamSupport.stream(iterable.spliterator(), false)
                .toList();
    }

    public List<User> findUsersByEmailContaining(String email) {
        OrderSpecifier<String> ascOrder = QUser.user.email.asc();
        Iterable<User> iterable = userRepository.findAll();
    }
}
