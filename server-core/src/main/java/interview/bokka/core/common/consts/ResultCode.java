package interview.bokka.core.common.consts;

public enum ResultCode {
    SUCCESS(1000);

    private final int value;

    ResultCode(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }
}
