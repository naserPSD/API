package sofenportfolio1.web.app.impl;
import sofenportfolio1.web.app.exceptions.*;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sofenportfolio1.web.app.entities.*;
import sofenportfolio1.web.app.payloads.CategoryDto;
import sofenportfolio1.web.app.payloads.UserDto;
import sofenportfolio1.web.app.repositories.*;
import sofenportfolio1.web.app.services.CategoryService;
@Service
public class CategoryServiceImp implements CategoryService {
	@Autowired
	private CategoryRepo categoryRepo;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public CategoryDto createCategory(CategoryDto categoryDto) {
		Category category = this.modelMapper.map(categoryDto, Category.class);
		Category addedCategory = this.categoryRepo.save(category);

		return this.modelMapper.map(addedCategory, CategoryDto.class);
	}

	@Override
	public CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId) {
		

		Category category = this.categoryRepo.findById(categoryId).orElseThrow(()-> new ResourceNotFoundException("Category","categoryid", categoryId));
		category.setCategoryDescription(categoryDto.getCategoryDescription());
		Category updatedcategory = this.categoryRepo.save(category);
		return this.modelMapper.map(updatedcategory, CategoryDto.class);
	}

	@Override
	public void deleteCategory(Integer categoryId) {
		Category category = this.categoryRepo.findById(categoryId).orElseThrow(()-> new ResourceNotFoundException("Category","categoryid", categoryId));
       this.categoryRepo.delete(category);
	}

	@Override
	public CategoryDto getCategory(Integer categoryId) {
		Category category = this.categoryRepo.findById(categoryId).orElseThrow(()-> new ResourceNotFoundException("Category","categoryid", categoryId));
		return this.modelMapper.map(category, CategoryDto.class);
	}

	@Override
	public List<CategoryDto> getCategories() {
		List<Category> categories = this.categoryRepo.findAll();
		 List<CategoryDto> catDtos= categories.stream().map((category)->this.modelMapper.map(category, CategoryDto.class)).collect(Collectors.toList());
		return catDtos;
	
	}

}
