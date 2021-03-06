package com.hello.app.common.model.response;

/**
 * @Author: dlice.
 * @Description: Common result interface
 * @Date:Created in 2020/9/1 22:33.
 * @Modified By:
 */
public interface ResultCode {
    //操作是否成功,true为成功，false操作失败
    boolean success();

    //操作代码
    int code();

    //提示信息
    String message();
}