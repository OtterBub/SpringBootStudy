package com.dbstudy.service;

import java.util.List;

import com.dbstudy.dto.*;

public interface BoardService {
    public abstract List < BoardDTO > boardList();
    public abstract BoardDTO showBoardDetail(int id);
}
