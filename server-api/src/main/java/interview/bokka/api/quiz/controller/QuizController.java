package interview.bokka.api.quiz.controller;

import interview.bokka.api.quiz.service.QuizService;
import interview.bokka.core.common.dto.ResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class QuizController {
    private final QuizService quizService;

    @GetMapping("/quizzes/{quizId}")
    public ResponseEntity<?> getQuiz(
            @PathVariable Long quizId
    ) {
        return ResponseDto.ok(quizService.getDetail(quizId));
    }
}
