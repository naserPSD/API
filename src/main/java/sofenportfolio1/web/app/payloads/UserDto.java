package sofenportfolio1.web.app.payloads;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

@NoArgsConstructor
@Setter
@Getter
public class UserDto {
	private int id;
	private String name;
	private String email;
	private String password;
	private String about;
	
}
