package com.felipepsi.todoapp.repository;

import com.felipepsi.todoapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;



import com.felipepsi.todoapp.entity.Todo;
import com.felipepsi.todoapp.entity.User;

import java.util.Optional;
public interface UserRepository extends JpaRepository<User,Long> {

}
