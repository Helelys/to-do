package com.xGo.coders.xGo_to_do_list.services;

import com.xGo.coders.xGo_to_do_list.model.dto.TasksDTO;
import com.xGo.coders.xGo_to_do_list.repository.TasksRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Data
@Service
public class TaksGet {

    private final TasksRepository tasksRepository;

    public List<TasksDTO> findAll() {
        return tasksRepository.findAll().stream()
                .map(task -> {
                    TasksDTO dto = new TasksDTO();
                    dto.setId(task.getId());
                    dto.setTitle(task.getTitle());
                    dto.setCreationDate(task.getCreationDate());
                    dto.setDescription(task.getDescription());
                    return dto;
                })
                .toList();
    }
}
