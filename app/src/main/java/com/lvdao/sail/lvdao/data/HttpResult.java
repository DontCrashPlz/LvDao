package com.lvdao.sail.lvdao.data;

/**
 * Created by Zheng on 2018/5/6.
 */

public class HttpResult<T> {
    private T data;
    private String description;
    private String errorCode;
    private String status;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isSuccess(){
        if ("success".equals(getStatus())){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "HttpResult{" +
                "data=" + data +
                ", description='" + description + '\'' +
                ", errorCode='" + errorCode + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
