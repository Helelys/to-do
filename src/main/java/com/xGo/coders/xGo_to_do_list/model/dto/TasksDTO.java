package com.xGo.coders.xGo_to_do_list.model.dto;

import com.xGo.coders.xGo_to_do_list.model.entity.Tasks;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@RequiredArgsConstructor
public class TasksDTO {
    private Long id;
    private String title;
    private LocalDateTime creationDate;
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
