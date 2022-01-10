package com.dbstudy.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbstudy.dto.*;
import com.dbstudy.dao.*;

@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    UserDAO dao;

    @Autowired
    SqlSessionTemplate session;

    @Override
    public List < UserDTO > userList() {
        return dao.userList(session);
    }
}
