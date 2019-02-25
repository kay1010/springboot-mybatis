package com.fk.service.Impl;

import com.fk.dao.userInfoMapper;
import com.fk.service.IUserService;
import com.fk.vo.userInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Herdsric-2018-01 on 2019/1/24.
 */
@Service("UserServiceImpl")
public class UserServiceImpl implements IUserService {




    @Autowired
    private userInfoMapper mapper;


    @Override
    public userInfo getUserInfo() {
        userInfo u=mapper.selectByPrimaryKey(23);
        if (u!=null){
            System.out.println("----this is getUserInfo method-----");

        }
        return u;
    }
}
