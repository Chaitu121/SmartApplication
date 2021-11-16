package com.conneqt.smartapp.controllers;

import java.util.List;
import org.json.simple.JSONObject;
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
import com.conneqt.smartapp.controlModels.Signin;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/admin")
public class CategoryController {

	@Autowired
	CategoryServices categoryServices;

	@GetMapping("/user/list")
	public ResponseEntity<?> getUser() {
		List<Category> uds = categoryServices.findAll();
		Object obj = new Object();
		System.out.println(uds);
		// return new ResponseEntity<>(uds, HttpStatus.OK);
		return ResponseEntity.ok().body(uds);
	}

	@PostMapping("/user/getData")
	public ResponseEntity<?> getUser2(@Valid @RequestBody Signin category) {
		Category categoryValue = categoryServices.findByEmail(category.getUsername());
		if (categoryValue != null) {
			if (categoryValue.getEncrypted_password().equals(category.getPassword())) {
				JSONObject json = new JSONObject();
				json.put("response", categoryValue);
				json.put("Status", "Success");
				return ResponseEntity.ok(json);
			} else {
				return ResponseEntity.badRequest().body("check your password");
			}

		} else {

			return ResponseEntity.badRequest().body(category.getUsername() + "is not Registered with us");
		}

	}

	@PostMapping("/category/create")
	public ResponseEntity<?> registerLocation(@Valid @RequestBody Category category) {
		categoryServices.save(category);
		return ResponseEntity.ok("category registered successfully!");
	}
}