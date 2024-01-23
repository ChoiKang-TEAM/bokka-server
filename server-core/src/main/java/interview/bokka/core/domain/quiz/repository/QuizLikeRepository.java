package interview.bokka.core.domain.quiz.repository;

import interview.bokka.core.domain.quiz.entity.QuizLike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizLikeRepository extends JpaRepository<Long, QuizLike> {
}
