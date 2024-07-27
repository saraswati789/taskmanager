package com.saraswati.taskmanager.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateTaskDTO {

    String title;
    String description;
    String deadline;
}
