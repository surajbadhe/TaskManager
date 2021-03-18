package com.sb.task.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TaskRequest {
	private String channel;
	private String conversationId;
	private String country;
	private TaskJsonData json_data;
	private TaskSecurity security;
}
