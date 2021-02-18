package com.wj.learn.dao;

import com.wj.learn.bean.AdminUserBean;

public interface AdminUserDao {

    AdminUserBean getInfo(String name, String password);

}
