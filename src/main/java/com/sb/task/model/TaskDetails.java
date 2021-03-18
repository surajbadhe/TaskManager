package com.sb.task.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaskDetails {
	
    private TaskData data;
    private TaskSecurity security;
	
}
