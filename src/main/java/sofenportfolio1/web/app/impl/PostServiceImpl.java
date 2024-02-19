package sofenportfolio1.web.app.impl;

import java.util.Date;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sofenportfolio1.web.app.entities.Category;
import sofenportfolio1.web.app.entities.Post;
import sofenportfolio1.web.app.entities.User;
import sofenportfolio1.web.app.exceptions.ResourceNotFoundException;
import sofenportfolio1.web.app.payloads.PostDto;
import sofenportfolio1.web.app.repositories.CategoryRepo;
import sofenportfolio1.web.app.repositories.PostRepo;
import sofenportfolio1.web.app.repositories.UserRepo;
import sofenportfolio1.web.app.services.PostService;
@Service
public class PostServiceImpl implements PostService {
	@Autowired
	private PostRepo postRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	@Autowired
	private UserRepo userRepo;
	@Autowired
	private CategoryRepo categoryRepo;
	
	@Override
	public PostDto createPost(PostDto postDto, Integer userId, Integer categoryId){
		User user = this.userRepo.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User","user id", userId));
		Post post = this.modelMapper.map(postDto, Post.class);
		Category category = this.categoryRepo.findById(categoryId).orElseThrow(()-> new ResourceNotFoundException("Category","category id", categoryId));
		post.setImageName("default.png");
		post.setAddedDate(new Date());
		Post newPost = this.postRepo.save(post);
		return this.modelMapper.map(newPost,PostDto.class);
	}

	@Override
	public Post updatePost(PostDto postDto, Integer postId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deletePost(Integer postId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Post> getAllPost() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post getPostById(Integer postId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> getPostsByCategory(Integer categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> getPostsByUser(Integer userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> searchPosts(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}

}
