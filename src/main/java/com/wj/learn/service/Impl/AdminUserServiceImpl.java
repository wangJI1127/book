package com.wj.learn.service.Impl;

import com.wj.learn.bean.AdminUserBean;
import com.wj.learn.mapper.AdminUserMapper;
import com.wj.learn.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 王吉
 */
@Service
public class AdminUserServiceImpl implements AdminUserService {

    @Autowired
    private AdminUserMapper adminUserMapper;

    @Override
    public AdminUserBean loginIn(String name, String password) {
        return adminUserMapper.getInfo(name, password);
    }
}
