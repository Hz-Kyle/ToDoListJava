package org.talent.toDoList.service;

import org.talent.toDoList.dto.NewCategoryRequest;
import org.talent.toDoList.entity.Category;

import java.util.List;

public interface CategoryService {

     Category saveNewCategory(NewCategoryRequest request);

     List<Category> findAllCategory ();

}
