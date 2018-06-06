package solutions.javaintermediate.chapter5.exercise6.graphics;

/**
 * Created by JonathanSyntra on 19/02/2017.
 */
public class NegativeSizeException extends Exception {
    public NegativeSizeException() {
        super();
    }

    public NegativeSizeException(String message) {
        super(message);
    }

    public NegativeSizeException(String message, Throwable cause) {
        super(message, cause);
    }

    public NegativeSizeException(Throwable cause) {
        super(cause);
    }

    protected NegativeSizeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
