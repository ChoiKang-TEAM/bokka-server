package interview.bokka.core.domain.quiz.repository;

import interview.bokka.core.domain.quiz.entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuizRepository extends JpaRepository<Quiz,Long> {
    boolean ExistsByIdAndAnswer(Long id, String answer);
}
