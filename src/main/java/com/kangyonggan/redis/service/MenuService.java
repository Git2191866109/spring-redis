package com.kangyonggan.redis.service;

import com.kangyonggan.redis.model.Menu;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author kangyonggan
 * @since 16/10/16
 */
@Service
public class MenuService {

    /**
     * 添加菜单
     *
     * @param menu
     */
    @CacheEvict(value = "menu", allEntries = true)
    public void saveMenu(Menu menu) {
        System.out.println("saveMenu:" + menu);
    }

    /**
     * 根据菜单ID查找菜单信息
     *
     * @param id
     * @return
     */
    @Cacheable(value = "menu", key = "'menu_id_' + #id")
    public Menu findMenuById(Long id) {
        System.out.println("findMenuById:" + id);
        return new Menu();
    }

    /**
     * 根据菜单ID查找菜单信息
     *
     * @param pageNum
     * @return
     */
    @Cacheable(value = "menu", key = "'menus_p_' + #pageNum")
    public List<Menu> findMenuByPage(int pageNum) {
        System.out.println("findMenuByPage:" + pageNum);

        return null;
    }

    /**
     * 更新菜单
     *
     * @param menu
     */
    @CacheEvict(value = {"menu"}, allEntries = true)
    public void updateMenu(Menu menu) {
        System.out.println("updateMenu:" + menu);
    }

    /**
     * 删除菜单
     *
     * @param id
     */
    @CacheEvict(value = "menu", allEntries = true)
    public void deleteMenu(Long id) {
        System.out.println("deleteMenu:" + id);
    }

    /**
     * 清空菜单缓存
     */
    @CacheEvict(value = "menu", allEntries = true)
    public void clearMenuCache() {
        System.out.println("clearMenuCache");
    }

}
