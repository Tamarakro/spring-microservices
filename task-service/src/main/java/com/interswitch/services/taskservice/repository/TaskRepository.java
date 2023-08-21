package com.interswitch.services.taskservice.repository;

import com.interswitch.services.taskservice.model.Task;

import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    private List<Task>tasks = new ArrayList<>();

    public void  add(Task task){
        tasks.add(task);
//        return task;
    }
    public List<Task> findByAssignedTo(Long assignedTo){
        return tasks.stream().filter(a -> a.getAssignedTo().equals(assignedTo)).toList();
    }
}
