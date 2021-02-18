package com.wj.learn;

import com.wj.learn.bean.AdminUserBean;
import com.wj.learn.service.AdminUserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
class LearnApplicationTests {

    @Autowired
    AdminUserService adminUserService;

    @Test
    void contextLoads() {
        AdminUserBean adminUserBean = adminUserService.loginIn("wj", "wangji");
        System.out.println("该用户ID为：");
        System.out.println(adminUserBean.getId());
    }

}
