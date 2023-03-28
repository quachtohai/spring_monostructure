package com.micro.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.micro.crud.entity.Category;
import com.micro.crud.service.ICategoryService;


@RestController
@RequestMapping("/api/category")

public class CategoryController {
@Autowired
ICategoryService categoryService;


@GetMapping
@ResponseStatus(HttpStatus.OK)
public List<Category> getAllProducts() {
    return categoryService.findAll();
}
@PostMapping
@ResponseStatus(HttpStatus.CREATED)
public void createCategory(@RequestBody Category category) {
	categoryService.save(category);
}
}
