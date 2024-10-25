package com.nickpug9.task.service;

import com.nickpug9.task.entity.Task;
import com.nickpug9.task.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {
    @Autowired
    private TaskRepository taskRepository;

    @Override
    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    @Override
    public List<Task> fetchAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Task getTaskById(Long id) {
        Optional<Task> task = taskRepository.findById(id);
        return task.orElse(null);
    }

    @Override
    public Task updateTask(Task task, Long idtask) {
        Task taskDB = taskRepository.findById(idtask).get();

        if (Objects.nonNull(task.getTaskname()) && !"".equalsIgnoreCase(task.getTaskname())) {
            taskDB.setTaskname(task.getTaskname());
        }
        if (Objects.nonNull(task.getTaskdescription()) && !"".equalsIgnoreCase(task.getTaskdescription())) {
            taskDB.setTaskdescription(task.getTaskdescription());
        }
        if (Objects.nonNull(task.getTaskcategory()) && !"".equalsIgnoreCase(task.getTaskcategory())) {
            taskDB.setTaskcategory(task.getTaskcategory());
        }
        return taskRepository.save(taskDB);
    }

    @Override
    public void deleteTaskById(Long idtask) {
        taskRepository.deleteById(idtask);
    }
}
