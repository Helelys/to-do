package com.xGo.coders.xGo_to_do_list.model.dto;

import com.xGo.coders.xGo_to_do_list.model.entity.Tasks;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor
public class TasksDTO {
    private Long id;
    private String title;

    private LocalDateTime creationDate = LocalDateTime.now();
    private String description;

    public Tasks toEntity() {
        Tasks task = new Tasks();
        task.setId(id);
        task.setTitle(title);
        task.setCreationDate(creationDate);
        task.setDescription(description);
        return task;
    }


}
