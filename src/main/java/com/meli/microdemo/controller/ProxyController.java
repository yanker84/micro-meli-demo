package com.meli.microdemo.controller;

import com.meli.microdemo.service.IProxyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class ProxyController {

    @Autowired
    private IProxyService proxyService;

    @GetMapping("/**")
    public String processRequest (HttpServletRequest request){

        return proxyService.processRequest(request);
    }


}
