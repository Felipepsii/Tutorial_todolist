package com.felipepsi.todoapp;

import com.felipepsi.todoapp.entity.Todo;
import com.felipepsi.todoapp.entity.User;
import com.felipepsi.todoapp.repository.TodoRepository;
import com.felipepsi.todoapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoAppApplication implements CommandLineRunner {

	@Autowired
	private final UserRepository userRepository;

	@Autowired
	private TodoRepository todoRepository;


	public TodoAppApplication(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(TodoAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		User user = new User();
		user.setId(1L);
		user.setPassword("should be hashed");
		user.setUsername("John");

		Todo todo = new Todo();
		todo.setId(1L);
		todo.setContent("Study Java");

		user.getTodoList().add(todo);

		todoRepository.save(todo);
		userRepository.save(user);

	}
}
