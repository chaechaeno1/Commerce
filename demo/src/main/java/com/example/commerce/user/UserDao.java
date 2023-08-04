package com.example.commerce.user;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * 데이터베이스에서 데이터를 가져오는 부분
 */
@Service
public class UserDao {
    Map<Long,User> database = new HashMap<>();
    Long databaseID = 0L;
    public void save(User user){

        database.put(databaseID++,user);
    }

    public User search(Long id){
        User user = database.get(id);
        return user;

    }

    public void out(String id){
        database.remove(id);
    }

}
