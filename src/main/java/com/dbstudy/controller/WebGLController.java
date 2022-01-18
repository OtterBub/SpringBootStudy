package com.dbstudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebGLController {

    @GetMapping("/webgltest")
    public ModelAndView webGLTest() {
        ModelAndView mav = new ModelAndView("webgl/webgl");

        return mav;
    }
    
}
