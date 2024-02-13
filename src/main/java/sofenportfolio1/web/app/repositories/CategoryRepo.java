package sofenportfolio1.web.app.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import sofenportfolio1.web.app.entities.Category;

public interface CategoryRepo extends JpaRepository <Category, Integer> {

	
}
