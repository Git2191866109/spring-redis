package com.kangyonggan.redis;

import com.kangyonggan.redis.model.User;
import com.kangyonggan.redis.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author kangyonggan
 * @since 2016/10/16
 */
public class UserServiceTest extends BaseTestCase {

    @Autowired
    private UserService userService;

    @Test
    public void testClearCache() {
        log("==========testClearCache==========");

        userService.clearUserCache();

        log("==========testClearCache==========");
    }

    /**
     * 测试查找用户
     */
    @Test
    public void testFindUserById() {
        log("==========testFindUserById==========");

        userService.findUserById(317L);

        userService.findUserById(318L);

        log("==========testFindUserById==========");
    }

    /**
     * 测试删除用户
     */
    @Test
    public void testDeleteUser() {
        log("==========testDeleteUser==========");

        userService.deleteUser(317L);

        log("==========testDeleteUser==========");
    }

    /**
     * 测试更新用户
     */
    @Test
    public void testUpdateUser() {
        log("==========testUpdateUser==========");

        User user = new User();
        user.setId(317L);

        userService.updateUser(user);

        log("==========testUpdateUser==========");
    }

    /**
     * 输出日志
     *
     * @param object
     */
    private void log(Object object) {
        System.out.println(object);
    }

}
