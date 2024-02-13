package sofenportfolio1.web.app.payloads;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Getter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {
	private Integer categoryId;
	private String categoryTitle;
	private String categoryDescription;
}


