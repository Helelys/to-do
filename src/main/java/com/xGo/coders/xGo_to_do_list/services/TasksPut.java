package com.xGo.coders.xGo_to_do_list.services;

import com.xGo.coders.xGo_to_do_list.model.dto.TasksDTO;
import com.xGo.coders.xGo_to_do_list.model.entity.Tasks;
import com.xGo.coders.xGo_to_do_list.repository.TasksRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TasksPut {
    private final TasksRepository tasksRepository;

    public TasksDTO editTask(Long id, TasksDTO dto) {
        return tasksRepository.findById(id)
                .map(task -> {
                    task.setTitle(dto.getTitle());
                    task.setDescription(dto.getDescription());
                    task.setCreationDate(dto.getCreationDate());
                    Tasks updatedTask = tasksRepository.save(task);
                    return updatedTask.toDTO();
                })
                .orElseThrow(() -> new IllegalArgumentException("Task with id " + id + " not found"));
    }
}
