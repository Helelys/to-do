package com.xGo.coders.xGo_to_do_list.controller;

import com.xGo.coders.xGo_to_do_list.model.dto.TasksDTO;
import com.xGo.coders.xGo_to_do_list.services.TaksGet;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
