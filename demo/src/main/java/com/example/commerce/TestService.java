package com.example.commerce;

import org.springframework.stereotype.Service;

/**
 * 로직을 수행하는 부분
 */

@Service
public class TestService {
    private final TestDao dao;

    public TestService(TestDao dao){
        this.dao = dao;
    }
    public String join(String id,String name){
        dao.save(id, name);
        return name + "님의 회원가입이 완료되었습니다.";
    }

    public String search(String id){
        String result = dao.search(id);
        if(result==null){
            return "가입된 ID가 아닙니다.";
        }
        return result;
    }

    public String out(String id){
        dao.out(id);
        return "회원탈퇴가 완료되었습니다.";
    }

}
