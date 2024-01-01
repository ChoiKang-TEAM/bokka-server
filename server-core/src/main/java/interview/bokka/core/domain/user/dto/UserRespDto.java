package interview.bokka.core.domain.user.dto;

import interview.bokka.core.domain.user.entity.User;

public record UserRespDto(
        int code
) {
    public static User toEntity(CreateUserReqDto request) {
        return User.builder()
                .userSeq(request.userSeq())
                .build();
    }
}
