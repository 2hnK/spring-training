package com.sample.springtraining.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.sample.springtraining.models.User;

public interface UserRepository extends JpaRepository<User, Long>, QuerydslPredicateExecutor<User> {

}
