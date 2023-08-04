package com.example.commerce.user;

import org.springframework.stereotype.Service;

/**
 * 로직을 수행하는 부분
 */

@Service
public class UserService {
    private final UserDao dao;

    public UserService(UserDao dao){
        this.dao = dao;
    }
    public String join(User user){
        dao.save(user);
        return user.getName() + "님의 회원가입이 완료되었습니다.";
    }

    public User search(Long id){
        User result = dao.search(id);
        return result;
    }

    public String out(String id){
        dao.out(id);
        return "회원탈퇴가 완료되었습니다.";
    }

}
