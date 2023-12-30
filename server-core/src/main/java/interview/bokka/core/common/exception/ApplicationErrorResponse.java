package interview.bokka.core.common.exception;

public record ApplicationErrorResponse(
    String code,
    String message
) {
        public static ApplicationErrorResponse of(String code, String message) {
            return new ApplicationErrorResponse(code, message);
        }

        public static ApplicationErrorResponse of(ApplicationErrorCode applicationerrorCode) {
            return new ApplicationErrorResponse(applicationerrorCode.getCode(), applicationerrorCode.getMessage());
        }
}


