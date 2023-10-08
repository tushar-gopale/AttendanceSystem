package com.tushardev.attendencesystem.service.serviceImpl;

import com.tushardev.attendencesystem.dao.UserRepo;
import com.tushardev.attendencesystem.entity.User;
import com.tushardev.attendencesystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    UserRepo userRepo;

    @Override
    public Boolean addUser(User user) {

        System.out.println(user);
        User save = userRepo.save(user);

        if(save!=null)
        return true;
        else
            return false;
    }
}
