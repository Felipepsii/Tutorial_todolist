package com.felipepsi.todoapp.repository;

import com.felipepsi.todoapp.entity.Todo;
import com.felipepsi.todoapp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo,Long> {

}
