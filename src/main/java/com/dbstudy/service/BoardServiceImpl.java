package com.dbstudy.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbstudy.dto.*;
import com.dbstudy.dao.*;

@Service
public class BoardServiceImpl implements BoardService {
    
    @Autowired
    BoardDAO boardDao;

    @Autowired
    SqlSessionTemplate session;

    @Override
    public List < BoardDTO > boardList() {
        return  boardDao.boardList(session);
    }

    @Override
    public BoardDTO showBoardDetail(int id) {
        return boardDao.showBoardDetail(session, id);
    }

    @Override
    public boolean create(BoardDTO dto) {
        return boardDao.createBoard(session, dto);
    }
    
    @Override
    public boolean delete(int bno) {
        System.out.println("delete ID: " + bno);
        return false;
    }
}
