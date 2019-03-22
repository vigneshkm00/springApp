package com.springApp.springApp.repositories;

import com.springApp.springApp.models.userdata;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<userdata,Integer> {
}
