package cn.CGC.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import cn.CGC.ssm.domain.User;
import cn.CGC.ssm.mapper.UserMapper;
import cn.CGC.ssm.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> loadAll() {
        return userMapper.loadAll();
    }

    @Transactional//默认就是写事务
    @Override
    public void save(User user) {
        userMapper.save(user);
    }

    @Override
    public User findByUserName(String username) {
        return userMapper.findByUserName(username);
    }
}
