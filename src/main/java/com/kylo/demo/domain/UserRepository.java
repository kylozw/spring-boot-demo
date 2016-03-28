package com.kylo.demo.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * PackageName: com.example.service
 * FileName: UserRepository.java
 * Description: TODO
 * Copyright: Copyright (c)2016
 * Company: songxiaocai
 *
 * @author wangzhang kylo.zw@gmail.com
 * @version 1.0, 16/3/25
 */
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUserName(String userName);

    User findByUserNameAndUserType(String userName, Integer userType);

    @Query("from User u where u.userName=:userName")
    User findUser(@Param("userName") String userName);

}
