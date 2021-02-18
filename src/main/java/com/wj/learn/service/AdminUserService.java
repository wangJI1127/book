package com.wj.learn.service;

import com.wj.learn.bean.AdminUserBean;

public interface AdminUserService {

    AdminUserBean loginIn(String name, String password);
}
