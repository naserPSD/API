package sofenportfolio1.web.app.repositories;

import java.util.List;


import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import sofenportfolio1.web.app.entities.Category;
import sofenportfolio1.web.app.entities.Post;

public interface PostRepo extends JpaRepository<Post, Integer> {

	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
	

	

}
