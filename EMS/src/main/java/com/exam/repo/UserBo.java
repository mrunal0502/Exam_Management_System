package com.exam.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.model.*;
@Repository
public interface UserBo extends JpaRepository<User, String>{
	
}
