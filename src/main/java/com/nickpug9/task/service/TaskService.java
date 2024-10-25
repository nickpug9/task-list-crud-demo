package com.nickpug9.task.service;

import com.nickpug9.task.entity.Task;
import java.util.List;

public interface TaskService {
    Task saveTask(Task task);
    List<Task> fetchAllTasks();
    Task getTaskById(Long id);
    Task updateTask(Task task, Long idtask);
    void deleteTaskById(Long idtask);
}
