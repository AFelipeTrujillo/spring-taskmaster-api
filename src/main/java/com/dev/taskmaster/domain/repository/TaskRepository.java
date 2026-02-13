package com.dev.taskmaster.domain.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dev.taskmaster.domain.model.Task;
import com.dev.taskmaster.domain.model.TaskStatus;

public interface TaskRepository extends JpaRepository <Task, UUID> {

    List<Task> findByStatus(TaskStatus status);
    
}
