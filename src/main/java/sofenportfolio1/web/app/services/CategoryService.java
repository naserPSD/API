package sofenportfolio1.web.app.services;
import java.util.List;
import sofenportfolio1.web.app.payloads.CategoryDto;

public interface CategoryService {

	CategoryDto createCategory(CategoryDto categoryDto);

	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);

	CategoryDto getCategory(Integer categoryId);

	List<CategoryDto> getCategories();

	void deleteCategory(Integer categoryId);
}
