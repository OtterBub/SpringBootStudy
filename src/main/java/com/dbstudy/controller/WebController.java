package com.dbstudy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dbstudy.dto.*;
import com.dbstudy.service.*;

@Controller
public class WebController {
    
    @Autowired
    UserService userService;
    @Autowired
    BoardService boardService;

    @RequestMapping("/")
    public String SelectAllFromUser() {
        return "redirect:/boardlist/";
    }

    @RequestMapping("/test")
    public ModelAndView pageNum(@RequestParam List<String> id, String name) {
        ModelAndView mav = new ModelAndView("0");

        mav.addObject("numList", id);
        mav.addObject("name", name);
        return mav;
    }

    @RequestMapping("/boardlist")
    public ModelAndView viewBoardList() {
        ModelAndView mav = new ModelAndView("board");
        
        List < BoardDTO > boardList = boardService.boardList();
        mav.addObject("boardList", boardList);

        List < UserDTO > userList = userService.userList();

        mav.addObject("list", userList);
        return mav;
    }
    @RequestMapping("/showboard")
    public ModelAndView showBoardDetail(@RequestParam int id) {
        ModelAndView mav = new ModelAndView("showboard");
        
        List < BoardDTO > boardList = boardService.boardList();
        mav.addObject("boardList", boardList);

        List < UserDTO > userList = userService.userList();

        mav.addObject("list", userList);
        mav.addObject("pageNum", id);

        BoardDTO boardDetail = boardService.showBoardDetail(id);
        mav.addObject("boardDetail", boardDetail);

        return mav;
    }

    @RequestMapping("/test2")
    public ModelAndView showString() {
        ModelAndView mav = new ModelAndView("showboard");
        
        return mav;
    }
}
