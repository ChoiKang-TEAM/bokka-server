package interview.bokka.api.user.controller;

import interview.bokka.api.user.service.UserService;
import interview.bokka.core.common.consts.ResultCode;
import interview.bokka.core.common.dto.ResponseDto;
import interview.bokka.core.domain.user.dto.CreateUserReqDto;
import interview.bokka.core.domain.user.dto.UserRespDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/users/create")
    public ResponseEntity<?> createUser(@RequestBody CreateUserReqDto request) {
        userService.createUser(UserRespDto.toEntity(request));
        return ResponseDto.created(new UserRespDto(ResultCode.SUCCESS.value()));
    }
}
