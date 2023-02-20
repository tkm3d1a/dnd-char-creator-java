package com.tkm3d1a.dndcharactercreator.Main;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class Main {

    @GetMapping("")
    public String index(){
        return "index";
    }
}
