package com.gausscode.competitiveanalysis.core;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(Exception.class)
    public ApiResponse<Void> exception(Exception e) {
        log.error("全局异常信息 ex={}", e.getMessage(), e);
        return ApiResponse.error();
    }


}
