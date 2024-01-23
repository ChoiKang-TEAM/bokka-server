package interview.bokka.core.domain.quiz.entity;
import interview.bokka.core.common.model.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
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

    @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL)
    private List<QuizLike> quizLikes = new ArrayList<>();
}
