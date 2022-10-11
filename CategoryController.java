package com.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blog.dto.request.CategoryRequestDto;
import com.blog.dto.response.ApiResponse;
import com.blog.service.CategoryService;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/")
	public ApiResponse getCategoryById(@RequestBody CategoryRequestDto categoryRequestDto) {
		return categoryService.getCategoryById(categoryRequestDto.getCategoryId());
	}
	
	@GetMapping("/all")
	public ApiResponse getAllCategories() {
		return categoryService.getAllCategories();
	}
	
	@PostMapping("/")
	public ApiResponse createCategory(@RequestBody CategoryRequestDto categoryRequestDto) {
		return categoryService.createCategory(categoryRequestDto);
	}
	
	@DeleteMapping("/")
	public ApiResponse deleteCategory(@RequestBody CategoryRequestDto categoryRequestDto) {
		return categoryService.deleteCategory(categoryRequestDto.getCategoryId());
	}
	
	@PutMapping("/")
	public ApiResponse updateCategory(@RequestBody CategoryRequestDto categoryRequestDto) {
		return categoryService.updateCategory(categoryRequestDto);
	}
}
