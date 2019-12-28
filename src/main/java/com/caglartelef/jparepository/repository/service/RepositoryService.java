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

    public boolean getUser(String email, String password) {
        try {
            UserInfos userInfo = userRepository.findUserByEmailAndPassword(email, password);
            return email.equals(userInfo.getEmail()) && password.equals(userInfo.getPassword());
        } catch (Exception ex) {
            throw new RepositoryException("User not found!");
        }
    }
}
