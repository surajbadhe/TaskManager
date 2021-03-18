package com.sb.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sb.task.entity.Task;

@Repository
public interface TaskManagerRepository extends JpaRepository<Task, Long> {

}
