package interview.bokka.core.domain.quiz.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

public class QuizSolveDto {

    @Getter
    public static class QuizSolveRequest {
        private String answer;
    }

    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    public static class QuizSolveResponse {
        private boolean solve;

        public static QuizSolveResponse of(
                boolean solve
        ) {
            return new QuizSolveResponse(
                    solve
            );
        }
    }
}
