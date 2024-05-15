package org.sopt.kakaopay.common.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
public enum SuccessMessage {

    BLOG_CREATE_SUCCESS(HttpStatus.CREATED.value(),"블로그 생성이 완료되었습니다."),

    PAYPOINT_FIND_SUCCESS(HttpStatus.OK.value(), "페이포인트 조회가 완료되었습니다.");

    private final int status;
    private final String message;
}
