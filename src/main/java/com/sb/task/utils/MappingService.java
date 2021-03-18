package com.sb.task.utils;

import java.util.Date;
import java.util.Optional;

import com.sb.task.entity.Task;
import com.sb.task.model.TaskData;
import com.sb.task.model.TaskDetails;
import com.sb.task.model.TaskRequest;
import com.sb.task.model.TaskSecurity;

public class MappingService {
	public static TaskDetails mapTaskToTaskDetails(Task task) {
		TaskDetails taskDeatils=new TaskDetails();
		TaskData taskData=new TaskData();
		TaskSecurity tSecurity=new TaskSecurity();
		taskData.setCreatedAt(task.getTaskCreateDate());
		taskData.setExpiringAt(task.getTaskExpiryDate());
		taskData.setTask_token("0000"+task.getTask_id());
		taskData.setUpdatedAt(task.getTaskUpdateDate());
		taskData.setTokenType(task.getTask_type());
		taskData.setTask_Status(Optional.ofNullable(task.getTask_Status()).orElse("Stoped"));
		tSecurity.setAuth_token("web-c1696899-d015-47c9-9472-9a665e28cef9");
		tSecurity.setClient_ip("172058014251");
		taskDeatils.setData(taskData);
		taskDeatils.setSecurity(tSecurity);
		return taskDeatils;
	}
	
	public static Task mapTaskRequestToTas(TaskRequest taskReq) {
		Task task = new Task();
		task.setTask_type(taskReq.getJson_data().getType());
		task.setTaskCreateDate(new Date());
		task.setTaskExpiryDate(new Date());
		task.setTaskUpdateDate(new Date());
		return task;
	}
}
