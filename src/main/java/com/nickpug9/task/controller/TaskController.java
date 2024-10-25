package com.nickpug9.task.controller;

import com.nickpug9.task.entity.Task;
import com.nickpug9.task.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody Task task) {
        Task createdTask = taskService.saveTask(task);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdTask);
    }

    @GetMapping
    public List<Task> getAllTasks() {
        return taskService.fetchAllTasks();
    }

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id) {
        return taskService.getTaskById(id);
    }

    @PutMapping("/{id}")
    public Task updateTask(@RequestBody Task task, @PathVariable Long id) {
        return taskService.updateTask(task, id);
    }

    @DeleteMapping("/{id}")
    public String deleteTaskById(@PathVariable Long id) {
        taskService.deleteTaskById(id);
        return "Task with ID " + id + " was deleted";
    }
}
