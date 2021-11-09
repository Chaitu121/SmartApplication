package com.conneqt.smartapp.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.conneqt.smartapp.models.Category;
import com.conneqt.smartapp.repository.CategoryRepository;
import com.conneqt.smartapp.services.CategoryServices;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/admin")
public class CategoryController {

	@Autowired
	CategoryServices categoryService;

	@GetMapping("/category/list")
	public ResponseEntity<?> getUser() {
		List<Category> uds = categoryService.findAll();
		Object obj = new Object();
		System.out.println(uds);
		// return new ResponseEntity<>(uds, HttpStatus.OK);
		return ResponseEntity.ok(uds);
	}

	/*
	 * @GetMapping("/category/list2") public String getUser22() { List<Category> uds
	 * = categoryService.findAll(); System.out.println(uds.get(0).getName()); return
	 * "sdfg"; }
	 */

	@PostMapping("/category/create")
	public ResponseEntity<?> registerLocation(@Valid @RequestBody Category category) {
		categoryService.save(category);
		return ResponseEntity.ok("category registered successfully!");
	}
}