package com.sb.task.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sb.task.entity.Task;
import com.sb.task.exception.ResourceNotFoundException;
import com.sb.task.model.TaskDetails;
import com.sb.task.model.TaskRequest;
import com.sb.task.repository.TaskManagerRepository;
import com.sb.task.utils.MappingService;

@Service
public class TaskManagerService {
	@Autowired
	TaskManagerRepository taskManagerRepository;

	@Transactional
	public TaskDetails saveTask(TaskRequest request) {
		/*Here we will write Decryption logic here. Read value from request object decrypt it and set into Task entity*/
		// task.setBlob(AES.decrypt(request.getJsonData().getBlob(),
		// httpHeaders.get("SECRET_KEY").get(0)));
		Task task=MappingService.mapTaskRequestToTas(request);
		task = taskManagerRepository.save(task);
		TaskDetails taskdeatils = null;
		if (task.getTask_id() != null) {
			taskdeatils = MappingService.mapTaskToTaskDetails(task);
		}
		return taskdeatils;

	}

	@Transactional
	public Task updateTask(Long taskId) throws ResourceNotFoundException {
		Task task = taskManagerRepository.findById(taskId)
				.orElseThrow(() -> new ResourceNotFoundException("Task not found for this id :: " + taskId));
		task.setTask_Status("Resumed");
		final Task updatedTask = taskManagerRepository.save(task);
		return updatedTask;
	}

	@Transactional
	public TaskDetails getTask(Long taskId) throws ResourceNotFoundException {
		return MappingService.mapTaskToTaskDetails(taskManagerRepository.findById(taskId)
				.orElseThrow(() -> new ResourceNotFoundException("Task not found for this id :: " + taskId)));
	}
}
