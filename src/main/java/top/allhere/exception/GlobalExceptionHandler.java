package top.allhere.exception;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import top.allhere.vo.ResultVo;

@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * 参数校验异常统一处理
     * @param e
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResultVo methodArgumentNotValidException(MethodArgumentNotValidException e) {
        ResultVo resultVo = new ResultVo(-1,e.getBindingResult().getFieldError().getDefaultMessage());
        return resultVo;
    }
}
