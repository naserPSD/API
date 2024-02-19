package sofenportfolio1.web.app.payloads;

import java.util.Date;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sofenportfolio1.web.app.entities.Category;
import sofenportfolio1.web.app.entities.User;
@Getter
@Setter
@NoArgsConstructor
public class PostDto {

	private String title;
	private String content;
	private String imageName;
	private Date addedDate;

	private CategoryDto category;

	private UserDto user;
}
