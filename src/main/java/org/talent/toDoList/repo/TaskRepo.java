package org.talent.toDoList.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.talent.toDoList.entity.Task;

@Repository
public interface TaskRepo extends JpaRepository<Task, Integer> {
}
