package com.api.imobiliaria.handlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ResponseHandler {

    public static ResponseEntity<Object> responseHandler(String msg, HttpStatusCode status, Object resObj){
        Map<String , Object> resMap = new  HashMap();

        resMap.put("Message", msg);
        resMap.put("status", status);

        if(status == HttpStatus.OK){
            resMap.put("data", resObj);
        }else{
            resMap.put("erros", resObj);
        }

        return new ResponseEntity<>(resMap, status);
    }
}
