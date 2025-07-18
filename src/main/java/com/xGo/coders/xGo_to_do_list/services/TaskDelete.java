package com.xGo.coders.xGo_to_do_list.services;

import com.xGo.coders.xGo_to_do_list.repository.TasksRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskDelete {

    private final TasksRepository tasksRepository;

    public void deleteTask(Long id) {
        tasksRepository.deleteById(id);
    }
}
