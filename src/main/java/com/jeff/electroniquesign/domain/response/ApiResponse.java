package com.jeff.electroniquesign.domain.response;

import com.jeff.electroniquesign.utils.Constant;
import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.time.Instant;

@Getter
public class ApiResponse extends AbstractResponse {

    private Object data;

    public ApiResponse(Object data) {
        super(HttpStatus.OK.value(), Instant.now(), Constant.OK_MESSAGE);
        this.data = data;
    }
}
