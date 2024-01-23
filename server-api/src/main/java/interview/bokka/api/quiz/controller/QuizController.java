package interview.bokka.api.quiz.controller;

import interview.bokka.api.quiz.service.QuizService;
import interview.bokka.core.common.dto.ResponseDto;
import interview.bokka.core.domain.quiz.dto.QuizSolveDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Tag(name = "퀴즈", description = "QUIZ API")
@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class QuizController {
    private final QuizService quizService;

    @Operation(summary = "퀴즈 상세 조회", description = "주어진 퀴즈 ID에 해당하는 퀴즈를 상세히 조회합니다.")
    @GetMapping("/quizzes/{quizId}")
    public ResponseEntity<?> getQuiz(
            @PathVariable Long quizId
    ) {
        return ResponseDto.ok(quizService.getDetail(quizId));
    }

    @Operation(summary = "퀴즈 풀기", description = "주어진 퀴즈 ID에 해당하는 퀴즈를 정답을 받아 풉니다.")
    @PostMapping("/quizzes/{quizId}")
    public ResponseEntity<?> solveQuiz(
            @PathVariable Long quizId,
            @RequestBody QuizSolveDto.QuizSolveRequest request
    ) {
        return ResponseEntity.ok(quizService.solveQuiz(quizId,request));
    }
}
