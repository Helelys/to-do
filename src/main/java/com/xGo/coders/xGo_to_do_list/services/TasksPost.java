package com.xGo.coders.xGo_to_do_list.services;

import com.xGo.coders.xGo_to_do_list.model.dto.TasksDTO;
import com.xGo.coders.xGo_to_do_list.model.entity.Tasks;
import com.xGo.coders.xGo_to_do_list.repository.TasksRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TasksPost {
    private final TasksRepository tasksRepository;

    public Tasks postTask(TasksDTO dto) {
        return tasksRepository.save(dto.toEntity());
    }
}
