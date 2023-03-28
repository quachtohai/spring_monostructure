package com.micro.crud.service;

import java.util.List;

import com.micro.crud.entity.Category;

public interface ICategoryService {

	void deleteAll();

	void deleteAllById(Iterable<? extends Long> ids);

	void delete(Category entity);

	long count();

	List<Category> findAll();

	<S extends Category> S save(S entity);

}
