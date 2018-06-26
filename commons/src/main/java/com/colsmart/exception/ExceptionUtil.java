package com.colsmart.exception;

/**
 * 异常信息
 * Created by yinan.zhang on 2017/5/31.
 */
public enum ExceptionUtil implements ExceptionType {
    EERRINFO("E1000", ""),
    DATABASE_ERROR("E1001", "数据库错误"),
    WEB_SOCKET_ERROR("E3001", "消息错误"),
    QM_STATUS_ERROR("E4001", "QM总线错误"),
    AUTHORIZE_INVALID("E8888", "认证失败"),
    USER_PASSWORD_ERROR("E8001", "密码错误"),
    USER_AUTH_ERROR("E8002", "该用户无此权限"),
    OTHER("E9999", "其他运行错误");

    ExceptionUtil(String code, String info) {
        this.code = code;
        this.errorInfoCN = info;
    }

    private String code;
    private String errorInfoCN;

    @Override
    public String getExceptionCode() {
        return code;
    }

    @Override
    public String getExceptionInfoCN() {
        return errorInfoCN;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getErrorInfoCN() {
        return errorInfoCN;
    }

    public void setErrorInfoCN(String errorInfoCN) {
        this.errorInfoCN = errorInfoCN;
    }
}
