package com.xGo.coders.xGo_to_do_list.controller;

import com.xGo.coders.xGo_to_do_list.model.dto.TasksDTO;
import com.xGo.coders.xGo_to_do_list.model.entity.Tasks;
import com.xGo.coders.xGo_to_do_list.services.TaksGet;
import com.xGo.coders.xGo_to_do_list.services.TasksPost;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class Controller {

    private final TaksGet taksGet;

    @GetMapping("/tasks")
    public ResponseEntity<List<TasksDTO>> findAll() {
        List<TasksDTO> tasks = taksGet.findAll();
        if (tasks.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(tasks);
    }

    private final TasksPost tasksPost;

    @PostMapping("/tasks")
    public ResponseEntity<TasksDTO> postTask(@RequestBody TasksDTO dto) {
        Tasks convertedTask = tasksPost.postTask(dto);

        return ResponseEntity.status(HttpStatus.CREATED).body(convertedTask.toDTO());
    }
}
