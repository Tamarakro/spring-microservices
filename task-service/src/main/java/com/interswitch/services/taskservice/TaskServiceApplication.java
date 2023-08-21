package com.interswitch.services.taskservice;

import com.interswitch.services.taskservice.model.Task;
import com.interswitch.services.taskservice.repository.TaskRepository;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Task API", version = "1.0", description = "Documentation Task API v1.0"))
public class TaskServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskServiceApplication.class, args);
	}
	@Bean
	TaskRepository taskRepository() {
	TaskRepository taskrepo = new TaskRepository();
	taskrepo.add(new Task(1L,"Joseph",1L));
	taskrepo.add(new Task(2L,"Mary",1L));
	taskrepo.add(new Task(3L,"John",1L));
	return taskrepo;
}
}
