package com.interswitch.services.taskservice.controller;

import com.interswitch.services.taskservice.model.Task;
import com.interswitch.services.taskservice.repository.TaskRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {
    private static final Logger LOGGER = LoggerFactory.getLogger(TaskController.class);
    @Autowired
    TaskRepository taskRepository;

    @GetMapping("/task/{employeeId}")
    public List<Task> findByEmployee(@PathVariable("employeeId") Long employeeId){
        LOGGER.info("Task find: employeeId={}", employeeId);
        return taskRepository.findByAssignedTo(employeeId);
    }
}
