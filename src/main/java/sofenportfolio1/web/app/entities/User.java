package sofenportfolio1.web.app.entities;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

@Entity
@Table(name="users")
@NoArgsConstructor
@Setter
@Getter

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id ;
	@Column(name = "user_name",nullable = false, length = 100)
	private String name;
	private String password;
	private String email;
	private String about;
	
	 @OneToMany(mappedBy = "user", cascade = CascadeType.ALL,fetch = FetchType.LAZY )
	    private List<Post> posts = new ArrayList<>();
}
