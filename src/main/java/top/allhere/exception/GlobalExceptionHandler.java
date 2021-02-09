package top.allhere.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import top.allhere.vo.ResultVo;

/**
 * @Author zhangjian
 * @Date 2021/2/8 9:55
 * @Description TODO
 */
@RestControllerAdvice
public class GlobalExceptionHandler {
    private static Logger logger = LoggerFactory.getLogger(GlobalExceptionHandler.class);
    /**
     * 异常
     * @param e
     * @return
     */
    @ExceptionHandler(BusinessException.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    public ResultVo internalServerError(BusinessException e){
        logger.info(e.getMessage());
        return new ResultVo(e.getCode(), e.getMsg());
    }

    /**
     * 参数校验异常统一处理
     * @param e
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResultVo methodArgumentNotValidException(MethodArgumentNotValidException e) {
        return new ResultVo(-1, e.getBindingResult().getFieldError().getDefaultMessage());
    }
}
