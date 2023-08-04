package com.example.commerce.user;

import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    private final UserService service;

    public UserController(UserService service){

        this.service = service;
    }

    /**
     * http method
     * get -자원을 가져옴 -> (id) 가져와!
     * post - 자원을 저장, requestBody가 존재
     *
     * {}
     * put - 자원을 수정, requestBody가 존재
     * delete - 자원을 삭제 -> (id) 삭제해!
     *
     */

    @PostMapping("join")
    @ResponseBody
    public String join(@RequestBody User user){
        return service.join(user);
    }

    @GetMapping("search")
    @ResponseBody
    public User search(@RequestParam Long id){

        return service.search(id);
    }

    //탈퇴 구현
    @DeleteMapping("out")
    @ResponseBody
    public String out(@RequestParam String id){
        return service.out(id);
    }

// 데이터베이스를 먼저 설계 하는 건 옛날(?) 스타일
    /**
     * user 테이블 설계
     * userID
     * name
     * password
     * ...
     */
// 유저의 행동을 먼저 정의 <<- 요즘 변하고 있는 추세
    /** 도메인 주도 설계 ... -> 기획자와의 소통, 기능위주로
     * 유저의 행동
     * 유저는 로그인
     * 유저는 상품구매
     * 유저는 상품을 배송받음
     * -> 로그인 : id / pw
     * -> 배송 :
     */


}