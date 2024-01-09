package technology.cariad.app.competitiveanalysis.exception;

import technology.cariad.app.competitiveanalysis.core.ResultCode;

public class ParamsException extends BaseException {

    public ParamsException(String message) {
        super(message, ResultCode.PARAM_ERROR);
    }

    public ParamsException() {
        super(ResultCode.PARAM_ERROR);
    }
}
