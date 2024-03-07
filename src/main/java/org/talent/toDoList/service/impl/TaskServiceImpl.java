package org.talent.toDoList.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.talent.toDoList.dto.NewTaskRequest;
import org.talent.toDoList.entity.Category;
import org.talent.toDoList.entity.Task;
import org.talent.toDoList.repo.CategoryRepo;
import org.talent.toDoList.repo.TaskRepo;
import org.talent.toDoList.service.TaskService;

import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    private TaskRepo taskRepo;

    @Autowired
    private CategoryRepo categoryRepo;

    @Override
    public Task saveNewTask(NewTaskRequest request) {
       Task task = Task.builder()
                .label(request.getLabel())
                .startTime(request.getStartTime())
                .endTime(request.getEndTime())
               .build();

        Category category = categoryRepo.findById(request.getCategoryID()).get();
        task.setCategory(category);
        return taskRepo.save(task);
    }

    @Override
    public List<Task> findAll() {
        return taskRepo.findAll();
    }
}
