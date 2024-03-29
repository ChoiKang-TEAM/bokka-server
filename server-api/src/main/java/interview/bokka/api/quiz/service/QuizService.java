package interview.bokka.api.quiz.service;

import interview.bokka.core.domain.quiz.dto.QuizRespDto;
import interview.bokka.core.domain.quiz.dto.QuizSolveDto;
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
        Quiz quiz = optionalQuiz.orElseGet(() -> null);
        if(quiz == null) {
            return QuizRespDto.of(1001);
        } else {
            return QuizRespDto.of(1000,quiz);
        }
    }

    public QuizSolveDto.QuizSolveResponse solveQuiz(
            Long quizId,
            QuizSolveDto.QuizSolveRequest request
    ) {
        return QuizSolveDto.QuizSolveResponse.of(quizRepository.ExistsByIdAndAnswer(quizId, request.getAnswer()));
    }
}
