package com.nickpug9.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.nickpug9.task.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
}
