package org.talent.toDoList.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.talent.toDoList.dto.NewCategoryRequest;
import org.talent.toDoList.entity.Category;
import org.talent.toDoList.service.CategoryService;
import org.talent.toDoList.utility.HttpResponse;

import java.util.List;

import static org.talent.toDoList.utility.HttpResponse.createResponse;

@RestController
@CrossOrigin
@RequestMapping("/categories")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping
    public ResponseEntity<HttpResponse<Category>> saveNewCategory(@RequestBody NewCategoryRequest request){
        Category category= categoryService.saveNewCategory(request);

        return createResponse(category, HttpStatus.CREATED);
    }

    @GetMapping
        public ResponseEntity<List<Category>> findAllCategory() {
            List<Category> categories = categoryService.findAllCategory();

        return  new ResponseEntity<>(categories, HttpStatus.OK);
    }

}
