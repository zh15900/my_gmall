package com.zh.gulimall.product.exception;

import com.zh.common.exception.BizCodeEnum;
import com.zh.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:  集中处理所有异常
 * @Created: with IntelliJ IDEA.
 * @author: 夏沫止水
 * @createTime: 2020-05-27 17:14
 **/

@Slf4j
//等于@ContrllerAdvice+@ResponseBody
@RestControllerAdvice(basePackages = "com.zh.gulimall.product.controller")
public class GulimallExceptionControllerAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public R handleValidException(MethodArgumentNotValidException e){
        log.error("数据效验出现问题{},异常类型{}",e.getMessage(),e.getClass());
        BindingResult bindingResult= e.getBindingResult();
        Map<String,String> errMap = new HashMap<>();
        bindingResult.getFieldErrors().forEach((fieldError) -> {
            errMap.put(fieldError.getField(),fieldError.getDefaultMessage());
        });
        return R.error(BizCodeEnum.VAILD_EXCEPTION.getCode(),BizCodeEnum.VAILD_EXCEPTION.getMessage()).put("data",errMap);
    }

    @ExceptionHandler(Throwable.class)
    public R handleException(Throwable throwable) {
        log.error("错误异常:",throwable);

        return R.error(BizCodeEnum.UNKNOW_EXCEPTION.getCode(),BizCodeEnum.UNKNOW_EXCEPTION.getMessage());
    }

//    /**
//     * 参数非法（效验参数）异常 MethodArgumentNotValidException
//     * @param e
//     * @return
//     */
//    @ExceptionHandler(MethodArgumentNotValidException.class)
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    public R handleValidException(MethodArgumentNotValidException e) {
//        log.error("数据效验出现问题{},异常类型{}",e.getMessage(),e.getClass());
//        BindingResult bindingResult = e.getBindingResult();
//
//        Map<String,String> errMap = new HashMap<>();
//        bindingResult.getFieldErrors().forEach((fieldError) -> {
//            errMap.put(fieldError.getField(),fieldError.getDefaultMessage());
//        });
//        return R.error(BizCodeEnum.VAILD_EXCEPTION.getCode(),BizCodeEnum.VAILD_EXCEPTION.getMessage())
//                .put("data",errMap);
//    }
//
//
//    @ExceptionHandler(value = Throwable.class)
//    public R handleException(Throwable throwable) {
//
//        log.error("错误异常{}",throwable);
//
//        return R.error(BizCodeEnum.UNKNOW_EXCEPTION.getCode(),BizCodeEnum.UNKNOW_EXCEPTION.getMessage());
//    }

}
