package sofenportfolio1.web.app.payloads;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotEmpty;
import lombok.Setter;
import lombok.Getter;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	private int id;
	@NotEmpty
	@Size(min = 4, message = "Username min 4 characters !!")
	private String name;
	@Email(message = "Email address is not valid !!")
	private String email;
	@NotEmpty
	@Size(min = 3, max = 10,message = "Password must be min of 3 chars and max of 10 chars !!")
	private String password;
	@NotEmpty
	private String about;
	
}
