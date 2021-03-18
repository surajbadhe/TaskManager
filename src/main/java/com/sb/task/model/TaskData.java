package com.sb.task.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskData {
	private String task_token;
	private String tokenType;
	private String task_Status;
	private Date createdAt;
	private Date expiringAt;
	private Date updatedAt;
}
