package com.demo.swagger.controller;

import com.demo.swagger.request.PostRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Enumeration;

/**
 * @Author: huangzh
 * @Date: 2024/2/20 11:17
 **/
@RestController()
@RequestMapping("post")
@Tag(name = "post")
public class PostController {
    @Operation(summary = "method1")
    @PostMapping("/method1")
    public String method1(@RequestBody PostRequest requestParam, HttpServletRequest request) {
        System.out.println(requestParam);
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            String headerValue = request.getHeader(headerName);
        }
        System.out.println("requestParam: " + requestParam + ", serverPort: " + request.getServerPort() + ", method" + request.getMethod() + "method1");
        return "requestParam: " + requestParam + ", serverPort: " + request.getServerPort() + ", method" + request.getMethod() + "method1";
    }
}
