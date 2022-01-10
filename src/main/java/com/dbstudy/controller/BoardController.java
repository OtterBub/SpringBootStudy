package com.dbstudy.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ch.qos.logback.classic.Logger;

import com.dbstudy.dto.*;
import com.dbstudy.service.*;

@Controller
public class BoardController {
    
    @Autowired
    BoardService boardService;

    @GetMapping("/board")
    public String view() {
        return "redirect:/boardlist/";
    }

    @PostMapping("/board")
    public String create(BoardDTO dto) {

        boardService.create(dto);
        return "redirect:/boardlist/";
    }

    @RequestMapping("/create")
    public String createTest() {
        LocalDateTime dateT = LocalDateTime.now();
        BoardDTO dto = new BoardDTO("Test", "TestContent", "작성자Test", dateT);
        boardService.create(dto);
        System.out.println("create Success");
        return "redirect:/boardlist/";
    }

    @DeleteMapping("/board/{bno}")
    public void delete(@PathVariable("bno") int bno) throws Exception {
        boardService.delete(bno);
    }
}
