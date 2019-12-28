package com.caglartelef.jparepository.repository.service;

import com.caglartelef.jparepository.exceptions.exceptions.RepositoryException;
import com.caglartelef.jparepository.repository.entity.UserInfos;
import com.caglartelef.jparepository.repository.IRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RepositoryService {

    @Autowired
    private IRepository userRepository;

    /**
     * This method goes to the database on the our repository and retrieves user information.
     * */
    public boolean getUser(String email, String password) {
        try {
            UserInfos userInfo = userRepository.findUserByEmailAndPassword(email, password);
            return email.equals(userInfo.getEmail()) && password.equals(userInfo.getPassword());
        } catch (Exception ex) {
            /**
             * When the database throws an error message, we catch it.
             * We throw a special error message by turning it into a meaningful message.
             * */
            throw new RepositoryException("User not found!");
        }
    }
}
