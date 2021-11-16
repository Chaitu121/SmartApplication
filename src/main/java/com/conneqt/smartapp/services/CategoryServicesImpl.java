package com.conneqt.smartapp.services;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.conneqt.smartapp.models.Category;
import com.conneqt.smartapp.repository.CategoryRepository;

@Service
public class CategoryServicesImpl  implements CategoryServices{
	@Autowired
	CategoryRepository categoryRepository;
	@Override
	public List<Category> findAll() {
		
		return categoryRepository.findAll();
	}

	@Override
	public Category findById(long id) {
		
		return categoryRepository.findById(id);
	}

	@Override
	public Category findByEmail(String id) {
		System.out.println("fghj");
		return categoryRepository.findByEmail(id);
	}
	@Override
	public void save(@Valid Category addCategory) {
		System.out.println(addCategory);
		categoryRepository.save(addCategory);
	}

	@Override
	public Category findByName(String addCategory) {
		System.out.println(addCategory);
		return categoryRepository.findByName(addCategory);
	}
	
}
