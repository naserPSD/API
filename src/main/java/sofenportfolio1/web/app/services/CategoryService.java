package sofenportfolio1.web.app.services;

import java.util.List;

import sofenportfolio1.web.app.payloads.CategoryDto;
import sofenportfolio1.web.app.payloads.UserDto;

public interface CategoryService {
	// create
	 CategoryDto createCategory(CategoryDto categoryDto);
	// update
	 CategoryDto updateCategory(CategoryDto categoryDto,Integer categoryId);
	// delete
	void deleteCategory(Integer categoryId);
	// get
	CategoryDto getCategory(Integer categoryId);
	// get All
	 List <CategoryDto> getCategories();
}
