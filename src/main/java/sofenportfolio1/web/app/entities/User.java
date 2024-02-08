package sofenportfolio1.web.app.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
	

}
