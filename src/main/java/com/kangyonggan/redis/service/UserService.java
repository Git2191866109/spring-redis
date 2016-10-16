package com.kangyonggan.redis.service;

import com.kangyonggan.redis.model.User;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author kangyonggan
 * @since 16/10/16
 */
@Service
public class UserService {

    /**
     * 根据用户ID查找用户信息
     *
     * @param id
     * @return
     */
    @Cacheable(value = "user", key = "'user_id_' + #id")
    public User findUserById(Long id) {
        System.out.println("findUserById:" + id);
        return new User();
    }

    /**
     * 更新用户
     *
     * @param user
     */
    @CacheEvict(value = "user", key = "'user_id_'+#user.getId()")
    public void updateUser(User user) {
        System.out.println("updateUser:" + user);
    }

    /**
     * 删除用户
     *
     * @param id
     */
    @CacheEvict(value = "user", key = "'user_id_'+#id")
    public void deleteUser(Long id) {
        System.out.println("deleteUser:" + id);
    }

    /**
     * 清空用户相关缓存
     */
    @CacheEvict(value = "user", allEntries = true)
    public void clearUserCache() {
        System.out.println("clearUserCache");
    }
}
