package com.example.workyproject.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.workyproject.models.User;

@Repository
public interface UserRepo extends CrudRepository<User, Long> {
	List<User> findAll();

}
