package com.fk.dao;

import com.fk.vo.userInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;


public interface userInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(userInfo record);

    int insertSelective(userInfo record);

    userInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(userInfo record);

    int updateByPrimaryKeyWithBLOBs(userInfo record);

    int updateByPrimaryKey(userInfo record);
}