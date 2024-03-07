package org.talent.toDoList.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.talent.toDoList.entity.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Integer> {
}
