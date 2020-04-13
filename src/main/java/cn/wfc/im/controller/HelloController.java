package cn.wfc.im.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.ServerSocket;

@Controller
public class HelloController {
    @Autowired
    private ServerSocket serverSocket;

    @RequestMapping("/jerry")
    public String toJerry() {
        return "jerry";
    }

    @RequestMapping("/tom")
    public String toTom(){
        return "tom";
    }
    @RequestMapping("/send")
    @ResponseBody
    public String send(String msg){
        return msg;
    }
}
