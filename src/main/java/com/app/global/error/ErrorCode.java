package com.app.global.error;

import lombok.Getter;
import org.springframework.http.HttpStatus;

/**
 * 에러코드를 관리하는 이넘으로 예외가 생겼을때 밖으로 내보낼 예외를 일괄적으로 관리하는 enum 이다.
 */
@Getter
public enum ErrorCode {
    // todo 아래 부분에 프로젝트상에서 발생 하는 에러와 status를 추가하여 관리 할 수 있음.
    TEST(HttpStatus.INTERNAL_SERVER_ERROR, "001", "business exception test")
    ;

    ErrorCode(HttpStatus httpsStatus, String errorCode, String message) {
        this.httpStatus = httpsStatus;
        this.errorCode = errorCode;
        this.message = message;
    }
    private HttpStatus httpStatus;
    private String errorCode;
    private String message;
}