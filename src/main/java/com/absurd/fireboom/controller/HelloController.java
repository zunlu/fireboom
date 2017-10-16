package com.absurd.fireboom.controller;

import com.absurd.fireboom.params.HelloParams;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

/**
 * Created by wangwenwei on 2017/10/16.
 */
@Api
@Slf4j
@RestController
@RequestMapping(value = "/hello")
public class HelloController {

    @GetMapping("world")
    public String world(@ModelAttribute  HelloParams helloParams, HttpServletRequest request){
        Map<String, String[]> map =  request.getParameterMap();
        String[] levels= request.getParameterValues("levels[]");
        String level=  request.getParameter("levels");
        return helloParams.toString();
    }

}
