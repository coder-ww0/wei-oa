package com.wei.oa.service.exception;

/**
 * @author wei
 * @date 2021/10/14 21:17
 * @description: 业务逻辑异常
 */
public class BussinessException extends RuntimeException {
    // 异常编码
    private String code;
    // 异常的具体的文本信息
    private String message;

    public BussinessException(String code, String msg) {
        super(code + ":" + msg);
        this.code = code;
        this.message = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
