package com.wj.learn.mapper;

import com.wj.learn.bean.AdminUserBean;

public interface AdminUserMapper {

    AdminUserBean getInfo(String name, String password);
}
