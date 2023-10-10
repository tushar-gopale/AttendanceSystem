package com.tushardev.attendencesystem.service.serviceImpl;

import com.tushardev.attendencesystem.dao.UserRepo;
import com.tushardev.attendencesystem.entity.User;
import com.tushardev.attendencesystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {


    @Autowired
    UserRepo userRepo;

    @Override
    public Boolean addUser(User user) {

        System.out.println(user);
        User save = userRepo.save(user);

        if (save != null)
            return true;
        else
            return false;
    }

    @Override
    public Boolean updateUser(User user) {

        User existingUser = userRepo.findById(user.getUserId()).get();
        if (existingUser != null) {
            existingUser.setUserEmailId(user.getUserEmailId());
            existingUser.setUserId(user.getUserId());
            existingUser.setUserName(user.getUserName());
            existingUser.setUserPhoneNo(user.getUserPhoneNo());
            userRepo.save(existingUser);

            return true;
        }
        return false;


    }

    @Override
    @Transactional
    public void deleteUserById(Integer userId) {
        userRepo.deleteById(userId);

    }

}
