package technology.cariad.app.competitiveanalysis.exception;

import technology.cariad.app.competitiveanalysis.core.ResultCode;

public class SQLException extends BaseException {
    public SQLException(String message, ResultCode code) {
        super(message, ResultCode.PARAM_ERROR);
    }

    public SQLException(ResultCode code) {
        super(code);
    }
}
