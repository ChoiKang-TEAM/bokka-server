package interview.bokka.api.quiz.controller;

import interview.bokka.api.quiz.service.QuizService;
import interview.bokka.core.common.dto.ResponseDto;
import interview.bokka.core.domain.quiz.dto.QuizSolveDto;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/quizzes/{quizId}")
    public ResponseEntity<?> solveQuiz(
            @PathVariable Long quizId,
            @RequestBody QuizSolveDto.QuizSolveRequest request
    ) {
        return ResponseEntity.ok(quizService.solveQuiz(quizId,request));
    }
}
