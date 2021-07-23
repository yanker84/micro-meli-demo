package com.meli.microdemo.service;

import com.meli.microdemo.model.RequestInfo;
import com.meli.microdemo.repository.RequestInfoRepository;
import com.meli.microdemo.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class ProxyService implements IProxyService {

    @Autowired
    private RequestInfoRepository requestInfoRepository;

    @Override
    public String processRequest(HttpServletRequest request){
        String ipAddress = request.getHeader("X-FORWARDED-FOR");
        //storing data
        requestInfoRepository.save(RequestInfo.builder().ip(request.getRemoteAddr())
                .path(request.getRequestURI()).build());

        return Constants.SOURCE_SERVER_URL +request.getRequestURI();
    }
}
