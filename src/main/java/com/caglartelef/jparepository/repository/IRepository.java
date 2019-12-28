package com.caglartelef.jparepository.repository;

import com.caglartelef.jparepository.repository.entity.UserInfos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepository extends JpaRepository<UserInfos, Integer> {

    /**
     * We extended our interface from JpaRepository
     * Library will recommend query parameters to us.
     * */
    UserInfos findUserByEmailAndPassword(String email, String password);

}
