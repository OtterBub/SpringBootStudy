package com.dbstudy.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.dbstudy.dto.BoardDTO;

@Repository
public class BoardDAOImpl implements BoardDAO {
    
    @Override
    public List < BoardDTO > boardList(SqlSessionTemplate session) {
        return session.selectList("BoardMapper.boardList");
    }

    @Override
    public BoardDTO showBoardDetail(SqlSessionTemplate session, int id) {
        session.update("BoardMapper.incresUpdateBoardReadcnt", id);
        return session.selectOne("BoardMapper.showBoardDetail", id);    
    }

    @Override
    public boolean createBoard(SqlSessionTemplate session, BoardDTO dto) {
        session.insert("BoardMapper.createBoard", dto);
        return true;
    }

    @Override
    public boolean deleteBoard(SqlSessionTemplate session, int id) {
        session.delete("BoardMapper.deleteBoard", id);
        return true;
    }

    @Override
    public boolean updateBoard(SqlSessionTemplate session, BoardDTO dto) {
        session.update("BoardMapper.updateBoard", dto);
        return true;
    }
}
