package com.tushardev.attendencesystem.dao.daoImpl;

import com.tushardev.attendencesystem.dao.UserDao;
import com.tushardev.attendencesystem.entity.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

@Repository
@Qualifier("UserDaoImpl")
public class UserDaoImpl implements UserDao {


    @Override
    public Boolean addUser(User user) {

        System.out.println(user);

        return true;
    }
}
