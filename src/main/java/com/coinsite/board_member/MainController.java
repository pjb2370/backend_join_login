package com.coinsite.board_member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
    @RequestMapping("/main")
    @ResponseBody
    public String index() {
        System.out.println("main");
        return "main";
    }
}
