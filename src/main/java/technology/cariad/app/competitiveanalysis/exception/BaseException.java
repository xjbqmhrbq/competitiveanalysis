package technology.cariad.app.competitiveanalysis.exception;

import technology.cariad.app.competitiveanalysis.core.Result;
import technology.cariad.app.competitiveanalysis.core.ResultCode;
import lombok.Getter;
import org.apache.commons.lang.StringUtils;

@Getter
public class BaseException extends Exception {

    private final ResultCode code;

    public BaseException(String message, ResultCode code) {
        super(message);
        this.code = code;
    }

    public BaseException(ResultCode code) {
        super(code.getMessage());
        this.code = code;
    }

    public Result getResult() {
        String message = getMessage();
        if (StringUtils.isBlank(message)) {
            message = code.getMessage();
        }
        return Result.fail(code.getCode(), message);
    }

}
