package cn.CGC.ssm.mapper;

import java.util.List;

import cn.CGC.ssm.domain.User;

public interface UserMapper {
    List<User> loadAll();
    void save(User user);
    User findByUserName(String username);
}
