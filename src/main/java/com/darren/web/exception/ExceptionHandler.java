package com.darren.web.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.darren.comm.exception.BusinessException;
import com.darren.comm.exception.ErrorMessage;
import com.darren.comm.vo.ClientMessage;

public class ExceptionHandler implements HandlerExceptionResolver {

    public ModelAndView resolveException(HttpServletRequest req, HttpServletResponse rep, Object obj, Exception e) {
        BusinessException exception = (BusinessException) e;
        ClientMessage clientMessage = new ClientMessage();
        clientMessage.setErrorCode(exception.getErrorCode());
        clientMessage.setMessage(ErrorMessage.getClientMessage(exception.getErrorCode()));
        ModelAndView modelView = new ModelAndView("error");
        modelView.addObject("clientMessage", clientMessage);

        return modelView;
    }
}
