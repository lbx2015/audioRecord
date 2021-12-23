package com.jk.audiorecorder;

public class BaseResponse <T>{
    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

    T result;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    int code;
}
