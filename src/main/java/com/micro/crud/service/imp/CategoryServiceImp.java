package com.micro.crud.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.micro.crud.entity.Category;
import com.micro.crud.repository.CategoryRepository;
import com.micro.crud.service.ICategoryService;

@Service
public class CategoryServiceImp implements ICategoryService {
@Autowired
CategoryRepository categoryRepository;

public CategoryServiceImp(CategoryRepository categoryRepository) {	
	this.categoryRepository = categoryRepository;
}

@Override
public List<Category> findAll() {
	return categoryRepository.findAll();
}

@Override
public long count() {
	return categoryRepository.count();
}

@Override
public void delete(Category entity) {
	categoryRepository.delete(entity);
}

@Override
public <S extends Category> S save(S entity) {
	return categoryRepository.save(entity);
}

@Override
public void deleteAllById(Iterable<? extends Long> ids) {
	categoryRepository.deleteAllById(ids);
}

@Override
public void deleteAll() {
	categoryRepository.deleteAll();
}

}
