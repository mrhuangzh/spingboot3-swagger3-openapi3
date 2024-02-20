package com.demo.swagger.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Enumeration;

/**
 * @Author: huangzh
 * @Date: 2024/2/20 11:15
 **/
@RestController()
@RequestMapping("get")
@Tag(name = "get")
@Slf4j
public class GetController {

    @Operation(summary = "method1")
    @GetMapping("/method1")
    public String method1(HttpServletRequest request) {
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String headerName = headerNames.nextElement();
            String headerValue = request.getHeader(headerName);
            System.out.println(headerName + ": " + headerValue);
        }
        System.out.println("serverPort: " + request.getServerPort() + ", method: " + request.getMethod() + ", method2");
        return "serverPort: " + request.getServerPort() + ", method: " + request.getMethod() + ", method2";
    }

    @Operation(summary = "method2")
    @GetMapping("/method2")
    public String method2(String name, HttpServletRequest request, HttpServletResponse response) {
        System.out.println("param: " + name + "serverPort: " + request.getServerPort() + ", method: " + request.getMethod() + ", method2");
        return "param: " + name + ", serverPort: " + request.getServerPort() + ", method: " + request.getMethod() + ", method2";
    }
}
