package com.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.rest.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{

}
