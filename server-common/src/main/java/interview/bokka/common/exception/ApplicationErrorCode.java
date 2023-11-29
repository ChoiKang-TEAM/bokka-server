package interview.bokka.common.exception;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ApplicationErrorCode {
    UNKNOWN_SERVER_ERROR("9999", "Unknown Server Error"),
    INVALID_INPUT_VALUE("9998", "Invalid Input Value");

    private final String code;
    private final String message;
}
