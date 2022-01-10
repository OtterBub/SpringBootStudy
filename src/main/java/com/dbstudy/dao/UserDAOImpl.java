package com.dbstudy.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.dbstudy.dto.UserDTO;

@Repository
public class UserDAOImpl implements UserDAO {
    
    @Override
    public List < UserDTO > userList(SqlSessionTemplate session) {
        return session.selectList("UserMapper.userList");
    }
}
