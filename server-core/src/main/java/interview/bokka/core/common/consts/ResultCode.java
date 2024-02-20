package interview.bokka.core.common.consts;

public enum ResultCode {
    SUCCESS(1000),
    EMPTY(1001),
    BAD(2000);
    private final int value;

    ResultCode(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }
}
