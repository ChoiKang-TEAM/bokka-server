package interview.bokka.core.domain.quiz.dto;

import interview.bokka.core.domain.quiz.entity.Quiz;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class QuizRespDto {
    private int code = 1000;
    private Quiz quiz;

    public static QuizRespDto of(
            int code,
            Quiz quiz
    ) {
        return new QuizRespDto(
                code,
                quiz
        );
    }
}
