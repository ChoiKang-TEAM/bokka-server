package interview.bokka.api.quiz.controller;

import interview.bokka.api.quiz.service.QuizLikeService;
import interview.bokka.core.common.dto.ResponseDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "퀴즈 좋아요", description = "QUIZ LIKE API")
@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class QuizLikeController {
    private final QuizLikeService quizLikeService;

    @Operation(summary = "퀴즈 좋아요", description = "주어진 퀴즈 ID에 해당하는 퀴즈를 좋아요 합니다.")
    @PostMapping("/quizzes/{quizId}/like")
    public ResponseEntity<?> like(
            @PathVariable Long quizId
    ) {
        return ResponseDto.ok(quizLikeService.like(quizId));
    }
}
