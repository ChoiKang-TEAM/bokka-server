package interview.bokka.core.common.dto;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public record ResponseDto<T>(T data) {

    public static <T> ResponseEntity<T> ok(T data) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(data);
    }

    public static <T> ResponseEntity<T> created(T data) {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(data);
    }

    public static ResponseEntity<Void> noContent() {
        return ResponseEntity
                .status(HttpStatus.NO_CONTENT)
                .build();
    }
}
