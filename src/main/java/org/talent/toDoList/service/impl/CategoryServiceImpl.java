package org.talent.toDoList.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.talent.toDoList.dto.NewCategoryRequest;
import org.talent.toDoList.entity.Category;
import org.talent.toDoList.repo.CategoryRepo;
import org.talent.toDoList.service.CategoryService;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepo categoryRepo;

    @Override
    public Category saveNewCategory(NewCategoryRequest request) {
//        Category category = new Category();
//        category.setName(request.getName());
//        category.setImageUrl(request.getImageUrl());  <= old java way

        Category category = Category.builder()
                        .name(request.getName())
                                .imageUrl(request.getImageUrl())
                                        .build();

       return categoryRepo.save(category);
    }

    @Override
    public List<Category> findAllCategory() {
        return categoryRepo.findAll();
    }
}
