package com.tushardev.attendencesystem.service.serviceImpl;

import com.tushardev.attendencesystem.dao.UserDao;
import com.tushardev.attendencesystem.dao.daoImpl.UserDaoImpl;
import com.tushardev.attendencesystem.entity.User;
import com.tushardev.attendencesystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    @Qualifier("UserDaoImpl")
    UserDao userDao;
    @Override
    public Boolean addUser(User user) {

       Boolean response= userDao.addUser(user);



        return response;
    }
}
