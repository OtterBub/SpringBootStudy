package com.dbstudy.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import com.dbstudy.dto.UserDTO;

public interface UserDAO {
    public abstract List < UserDTO > userList(SqlSessionTemplate session);
}
