package cn.CGC.ssm.service;

import java.util.List;

import cn.CGC.ssm.domain.User;

public interface IUserService {
    List<User> loadAll();

    void save(User user);

    User findByUserName(String username);
}
