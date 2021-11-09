package com.conneqt.smartapp.services;

import java.util.List;

import javax.validation.Valid;

import com.conneqt.smartapp.models.Category;

public interface CategoryServices {
	List<Category> findAll();
	Category findById(long id);
	void save(@Valid Category addCategory);
}
