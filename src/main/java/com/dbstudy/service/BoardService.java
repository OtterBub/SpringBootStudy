package com.dbstudy.service;

import java.util.List;

import com.dbstudy.dto.*;

public interface BoardService {
    public abstract List < BoardDTO > boardList();
    public abstract BoardDTO showBoardDetail(int id);
    public abstract boolean create(BoardDTO dto);
    public abstract boolean delete(int id);
    public abstract boolean update(int id, String title, String content);
}
