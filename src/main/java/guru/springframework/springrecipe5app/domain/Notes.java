package guru.springframework.springrecipe5app.domain;

import lombok.*;

import javax.persistence.*;

@Data
@EqualsAndHashCode(callSuper= false, exclude="recipe")
@Entity
public class Notes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne()
    private Recipe recipe;

    @Lob
    private String recipeNotes;

}
