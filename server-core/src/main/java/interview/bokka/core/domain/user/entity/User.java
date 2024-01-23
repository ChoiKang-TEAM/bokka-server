package interview.bokka.core.domain.user.entity;

import interview.bokka.core.common.model.BaseEntity;
import interview.bokka.core.domain.quiz.entity.QuizLike;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
@Builder
public class User extends BaseEntity {

    @Id
    @Column(name = "user_seq", nullable = false)
    private String userSeq;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<QuizLike> quizLikes;
}
