package top.allhere.vo;

/**
 * @author zj_xianghong
 * @create 2021/1/23 21:52
 * @modified
 * @des
 * code 状态码 msg状态信息 count数据总条数 data数据
 * todo
 */
public class ResultVo<T> {
    private Integer code;
    private String msg;
    private Long count;
    private T data;



    public ResultVo() {
        this.code = -1;
        this.msg = "请求失败!";
    }

    public ResultVo(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResultVo(Long count, T data) {
        this.code = 0;
        this.msg = "请求成功!";
        this.count = count;
        this.data = data;
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

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
