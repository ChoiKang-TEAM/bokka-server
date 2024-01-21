package interview.bokka.api.quiz.service;

import interview.bokka.core.domain.quiz.dto.QuizRespDto;
import interview.bokka.core.domain.quiz.entity.Quiz;
import interview.bokka.core.domain.quiz.repository.QuizRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class QuizService {
    private final QuizRepository quizRepository;

    public QuizRespDto getDetail(Long quizId) {
        Optional<Quiz> optionalQuiz = quizRepository.findById(quizId);
        Quiz quiz = optionalQuiz.get();
        return QuizRespDto.of(1000,quiz);
    }
}
