package org.talent.toDoList.service;

import org.talent.toDoList.dto.NewTaskRequest;
import org.talent.toDoList.entity.Task;

import java.util.List;

public interface TaskService {

    Task saveNewTask(NewTaskRequest request);

    List<Task> findAll();


}
