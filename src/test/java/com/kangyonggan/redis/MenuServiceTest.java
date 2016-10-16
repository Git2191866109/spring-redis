package com.kangyonggan.redis;

import com.kangyonggan.redis.service.MenuService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author kangyonggan
 * @since 2016/10/16
 */
public class MenuServiceTest extends BaseTestCase {

    @Autowired
    private MenuService menuService;

    @Test
    public void testClearCache() {
        log("==========testClearCache==========");

        menuService.clearMenuCache();

        log("==========testClearCache==========");
    }

    /**
     * 测试查找菜单
     */
    @Test
    public void testFindMenuById() {
        log("==========testFindMenuById==========");

        menuService.findMenuById(417L);

        menuService.findMenuById(418L);

        log("==========testFindMenuById==========");
    }

    /**
     * 测试查找菜单
     */
    @Test
    public void testFindMenuByPage() {
        log("==========testFindMenuByPage==========");

        menuService.findMenuByPage(2);

        menuService.findMenuByPage(2);

        log("==========testFindMenuByPage==========");
    }

    /**
     * 测试查找菜单
     */
    @Test
    public void testDeleteMenu() {
        log("==========testDeleteMenu==========");

        menuService.deleteMenu(234L);

        log("==========testDeleteMenu==========");
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
