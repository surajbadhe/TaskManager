package com.sb.task.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Task_Details")
public class Task {
	@Id
    @GeneratedValue
	private Long task_id;
	private String task_name;
	private String task_description;
	private String task_type;
	private String taskToken;
	private String task_Status;
	private String blob;
	private String type;
	private Date taskCreateDate;
	private Date taskUpdateDate;
	private Date taskExpiryDate;
}