package spring.study.common.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import static org.springframework.http.HttpStatus.*;

@Getter
@AllArgsConstructor
public enum ErrorCode {

    DUPLICATED_MEMBER(CONFLICT, "이미 존재하는 회원입니다."),
    FAIL_VALIDATE(BAD_REQUEST, "유효성 통과 실패"),
    FAIL_DELETE_MEMBER(BAD_REQUEST, "회원 탈퇴 실패");

    private final HttpStatus httpStatus;
    private final String errorMsg;

}