public class NOTFOUD extends RuntimeException {
    public NOTFOUD() {
    }

    public NOTFOUD(String message) {
        super(message);
    }

    public NOTFOUD(String message, Throwable cause) {
        super(message, cause);
    }

    public NOTFOUD(Throwable cause) {
        super(cause);
    }

    public NOTFOUD(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
