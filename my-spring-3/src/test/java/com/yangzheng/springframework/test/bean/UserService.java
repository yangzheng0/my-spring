package com.yangzheng.springframework.test.bean;

/**
 * @author yangzheng
 * @description
 * @date 2021/9/15 01511:06
 */
public class UserService {
    private String name;

    public UserService(String name) {
        this.name = name;
    }

    public UserService() {
    }

    public void queryUserInfo() {
        System.out.println("查询用户信息：" + name);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("").append(name);
        return sb.toString();
    }
}
