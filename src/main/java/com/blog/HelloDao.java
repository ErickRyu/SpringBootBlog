package com.blog;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blog.Hello;
public interface HelloDao extends JpaRepository <Hello, Integer> {

}