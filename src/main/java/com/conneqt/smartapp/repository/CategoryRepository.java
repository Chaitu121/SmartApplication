package com.conneqt.smartapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.conneqt.smartapp.models.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	Category findById(long id);
	Category findByName(String id);
	Category findByEmail(String id);
}
