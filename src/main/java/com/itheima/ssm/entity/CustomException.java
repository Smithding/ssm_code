package com.itheima.ssm.entity;

public class CustomException extends  Exception {

    //异常信息
    private String message;

    public CustomException(String message){
        this.message = message;
    }




    public String getMessage() {
        return message;
    }

    public void setMessage(String mesage) {
        this.message = mesage;
    }
}
