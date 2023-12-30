package interview.bokka.core.domain.quiz.entity;
import interview.bokka.core.common.model.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
public class Quiz extends BaseEntity {

    @Id
    @Column(name =  "quiz_id", nullable = false)
    private Long id;

    @Column(name = "question", nullable = false)
    private String question;

    @Column(name = "quiz_type", nullable = false)
    private String quizType;

    @Column(name = "description")
    private String description;

    @Column(name = "answer", nullable = false)
    private String answer;

    @Column(name = "level", nullable = false)
    private int level;
}
