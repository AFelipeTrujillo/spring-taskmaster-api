package com.dev.taskmaster.web.dto;

import com.dev.taskmaster.domain.model.TaskStatus;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record TaskRequest (
    
    @NotBlank(message = "The title is required")
    @Size(max = 100)
    String title,

    @Size(max = 250)
    String description,

    TaskStatus taskStatus

){}
