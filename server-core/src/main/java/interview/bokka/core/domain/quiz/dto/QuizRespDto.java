package interview.bokka.core.domain.quiz.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import interview.bokka.core.domain.quiz.entity.Quiz;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QuizRespDto {
    private int code;
    private Quiz quiz;

    public static QuizRespDto of(
            int code
    ) {
        return new QuizRespDto(
                code,
                null
        );
    }

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
