package top.allhere.exception;


import top.allhere.enums.BusinessEnum;

/**
 * @Author zhangjian
 * @Date 2021/2/8 9:44
 * @Description 定义异常
 */
public class BusinessException extends RuntimeException {
    private static final long serialVersionUID = -812591417834118785L;
    private Integer code;
    private String msg;

    public BusinessException(BusinessEnum businessEnum) {
        this.code = businessEnum.getCode();
        this.msg = businessEnum.getMsg();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
