package top.allhere.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import top.allhere.vo.ResultVo;

import java.util.Locale;

/**
 * @author zj_xianghong
 * @create 2021/1/23 22:02
 * @modified
 * @des
 */
@RestController
public class TestController {
    @GetMapping("/test/test")
    public ResultVo test(){
        ResultVo resultVo = new ResultVo();
        return resultVo;
    }

    public static void main(String[] args) {
        String str = "MethodArgumentNotValid";
        System.out.println(str.toUpperCase(Locale.ROOT));
    }
}
