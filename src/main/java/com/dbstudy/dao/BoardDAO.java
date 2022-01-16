package com.dbstudy.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import com.dbstudy.dto.BoardDTO;

public interface BoardDAO {
    public abstract List < BoardDTO > boardList(SqlSessionTemplate session);
    public abstract BoardDTO showBoardDetail(SqlSessionTemplate session, int id);
    public abstract boolean createBoard(SqlSessionTemplate session, BoardDTO dto);
    public abstract boolean deleteBoard(SqlSessionTemplate session, int id);
    public abstract boolean updateBoard(SqlSessionTemplate session, BoardDTO dto);
}
