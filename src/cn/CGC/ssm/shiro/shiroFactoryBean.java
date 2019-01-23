package cn.CGC.ssm.shiro;

import java.util.LinkedHashMap;
import java.util.Map;

public class shiroFactoryBean {
    public Map<String, String> getUrl() {
        Map<String, String> map = new LinkedHashMap<>();
        //登录页面可以匿名访问
        map.put("/login.jsp", "anon");
        //登录处理也需要匿名访问
        map.put("/login", "anon");
        //不需要权限的url可以匿名访问
        map.put("/user/index", "anon");
        //不需要权限的页面可以匿名访问
        map.put("/anon.jsp", "anon");
        //对应的url需要相关权限
        //map.put("/user/save", "perms[user:save]");
        //map.put("/user/findAll", "perms[user:findAll]");
        //根路径及其子子孙孙都需要登录才能访问。
        map.put("/**", "authc");
        return map;
    }
}
