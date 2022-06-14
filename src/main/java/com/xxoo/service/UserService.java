package com.xxoo.service;

import com.xxoo.dao.TblUserMapper;
import com.xxoo.entity.TblUser;
import org.apache.commons.lang3.ObjectUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Resource
    private TblUserMapper tblUserMapper;


    public List<TblUser> getAllUser(){
        List<TblUser> results = tblUserMapper.selectList(null);
        if(ObjectUtils.isEmpty(results)){
            return null;
        }
        return results;
    }



}
