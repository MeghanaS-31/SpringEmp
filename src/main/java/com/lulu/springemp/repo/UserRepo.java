package com.lulu.springemp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lulu.springemp.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
