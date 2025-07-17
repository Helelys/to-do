package com.xGo.coders.xGo_to_do_list.model.dto;

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
}
