package com.example.rabbitmq.producer.controller;

import com.example.rabbitmq.producer.config.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class MessageController {
    @Autowired
    Producer producer;

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping(value = "sendMessage", method = RequestMethod.GET)
    public String sendMessage(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, ModelMap modelMap){

        String number = httpServletRequest.getParameter("number");

        if(number!=null &&number.length()>0){
            producer.productMsg(number);
            modelMap.put("MessageStatus", "Message Sent..");
        }else{
            modelMap.put("MessageStatus", "Enter something to be Sent..");
        }
        System.out.println("Number = " + number);

        return "index";
    }
}
