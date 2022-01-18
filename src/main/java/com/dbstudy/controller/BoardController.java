package com.dbstudy.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dbstudy.dto.*;
import com.dbstudy.service.*;

@Controller
public class BoardController {
    
    @Autowired
    BoardService boardService;

    @RequestMapping("/testview")
    public ModelAndView testView() {
        ModelAndView mav = new ModelAndView("testview");
        return mav;
    }

    @GetMapping("/board")
    public String view() {
        return "redirect:/boardlist";
    }

    @GetMapping("/writeboard")
    public ModelAndView writeBoard(BoardDTO dto) {
        ModelAndView mav = new ModelAndView("insertboard");
        
        List < BoardDTO > boardList = boardService.boardList();
        mav.addObject("boardList", boardList);

        return mav;
    }

    @PostMapping("/insertboard")
    public String create(@ModelAttribute BoardDTO dto) {
        boardService.create(dto);
        return "redirect:/boardlist/";
    }

    // @RequestMapping("/createtest")
    // public String createTest() {
    //     LocalDateTime dateT = LocalDateTime.now();
    //     BoardDTO dto = new BoardDTO("Test", "TestContent", "작성자Test", dateT);
    //     boardService.create(dto);
    //     System.out.println("create Success");
    //     return "redirect:/boardlist/";
    // }

    @PostMapping(value = "/deleteboard/{id}")
    public String delete(@PathVariable int id) {
        boardService.delete(id);
        return "redirect:/boardlist";
    }

    // @GetMapping(value = "/updateboard/{id}")
    // public String update(@PathVariable int id, @PathVariable String content) {
    //     boardService.update(id, content);
    //     return "redirect:/baordlist/";
    // }
    @GetMapping(value = "/updatetest/")
    public String updateTest(@RequestParam(required = true) int id) {
        // boardService.update(id, "content");
        return "redirect:/boardlist/";
    }

    @GetMapping(value = "/updateboard")
    public ModelAndView update(
        @RequestParam(required = true) int id) {
            ModelAndView mav = new ModelAndView("updateboard");
            List < BoardDTO > boardList = boardService.boardList();
            mav.addObject("boardList", boardList);

            BoardDTO dto = boardService.showBoardDetail(id);

            mav.addObject("boardDetail", dto);

            return mav;
    }

    @PostMapping(value = "/updateboard.do")
    public String update(@ModelAttribute BoardDTO dto) {

        // %02 {title or content} %03
        // %02 - Start of Text
        // %03 - End of Text
        if(dto != null) {
            boardService.update(dto);
        }
        return "redirect:/boardlist";
    }
}