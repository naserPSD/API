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
@Table(name = "categories")
@NoArgsConstructor
@Setter
@Getter
public class Category {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;
    
    @Column(name = "title", length = 100, nullable = false)
    private String categoryTitle;
    
    @Column(name = "description")
    private String categoryDescription;
}



