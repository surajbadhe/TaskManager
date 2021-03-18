package com.sb.task.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sb.task.exception.ResourceNotFoundException;
import com.sb.task.model.SuccesResponse;
import com.sb.task.model.TaskDetails;
import com.sb.task.model.TaskRequest;
import com.sb.task.service.TaskManagerService;
 
 
@RestController
@RequestMapping("/api/")
public class TaskManagerController {
	@Autowired
	private TaskManagerService taskManagerService;

	@Autowired
	public TaskManagerController(TaskManagerService taskManagerService) {
		this.taskManagerService = taskManagerService;
	}

	@PostMapping(value = "/task", produces = { "application/json" })
	@ResponseStatus(HttpStatus.CREATED)
	public ResponseEntity<TaskDetails> createTask(@RequestBody final TaskRequest request,
			@RequestHeader final HttpHeaders httpHeaders) {
		return ResponseEntity.ok(taskManagerService.saveTask(request));
	}

	@PutMapping("/task/{taskId}")
	public ResponseEntity<SuccesResponse> updateTask(@PathVariable Long taskId, @RequestBody final TaskDetails request)
			throws ResourceNotFoundException {
		taskManagerService.updateTask(taskId);
		return ResponseEntity.ok(new SuccesResponse("Success", "task has been resumed"));
	}

	@GetMapping("/task/{taskId}")
	public ResponseEntity<TaskDetails> getTask(@PathVariable Long taskId) throws ResourceNotFoundException {
		return ResponseEntity.ok(taskManagerService.getTask(taskId));
	}

}
