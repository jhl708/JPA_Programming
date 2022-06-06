package com.hr.jpa.bookmanager.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void test(){

        User user = new User();
        user.setEmail("hyerii4285@gmail.com");
        user.setName("hyerii");
        System.out.println(">>>>> user :  " + user.toString());
        // >>>>> user :  User(name=hyerii, email=hyerii4285@gmail.com, createdAt=null, updateAt=null)

        User user1 = new User("hyerii", "hyerii4285@gmail.com", LocalDateTime.now(), LocalDateTime.now());
        System.out.println(">>>>> user1 : " + user1.toString());
        // >>>>> user1 : User(name=hyerii, email=hyerii4285@gmail.com, createdAt=2022-06-06T16:07:04.342, updateAt=2022-06-06T16:07:04.342)

        User user2 = User.builder().name("hyerii").email("hyerii4285@gmail.com").build();
        System.out.println(">>>>> user2 : " + user2.toString());
        // >>>>> user2 : User(name=hyerii, email=hyerii4285@gmail.com, createdAt=null, updateAt=null)

    }

}