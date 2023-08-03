package com.example.commerce;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * 데이터베이스에서 데이터를 가져오는 부분
 */
@Service
public class TestDao {
    Map<String,String> database = new HashMap<>();
    public void save(String id,String name){
        database.put(id,name);
    }

    public String search(String id){
        String name = database.get(id);
        return name;

    }

    public void out(String id){
        database.remove(id);
    }

}
