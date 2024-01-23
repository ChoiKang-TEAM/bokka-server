package interview.bokka.api.quiz.service;

import interview.bokka.core.common.dto.commonDto;
import interview.bokka.core.domain.quiz.repository.QuizRepository;
import interview.bokka.core.domain.user.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class QuizLikeService {

    private final QuizRepository quizRepository;
    public commonDto like(Long quizId) {
        //String seq = SecurityContextHolder.getContext().getAuthentication().getPrincipal().toString(); 추후 구현
        //Optional<User> optionalUser = userRepository.findById(seq);


    }
}
