package top.allhere.enums;

/**
 * @Author zhangjian
 * @Date 2021/2/8 9:41
 * @Description 状态码枚举
 */
public enum BusinessEnum {
    /**
     * 状态码枚举
     */
    UNEXPECTED_EXCEPTION(500, "系统发生异常，请联系管理员！"),
    ILLEGAL_REQUEST(1001,"非法请求！"),
    SAVE_SUCCESS(0,"新增成功！"),
    SAVE_FAIL(-1,"新增失败！"),
    DELETE_SUCCESS(0,"删除成功！"),
    DELETE_FAIL(-1,"删除失败！"),
    UPDATE_SUCCESS(0,"更新成功！"),
    UPDATE_FAIL(-1,"更新失败！");
    /**
     * 消息码
     */
    private Integer code;
    /**
     * 消息内容
     */
    private String msg;

    BusinessEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
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
