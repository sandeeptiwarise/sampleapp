package com.yamaha.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.yamaha.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
}
