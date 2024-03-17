package org.example.libraryapp.controller.user;

import org.example.libraryapp.domain.user.User;
import org.example.libraryapp.dto.user.request.UserCreateRequest;
import org.example.libraryapp.dto.user.response.UserResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    private final List<User> users = new ArrayList<>(); // User 객체를 저장할 수 있는 리스트를 생성합니다.
    @PostMapping("/user") // POST /user
    public void saveUser(@RequestBody UserCreateRequest request){
        // Save user(유저 저장)
        users.add(new User(request.getName(), request.getAge())); // User 객체를 생성하여 users 리스트에 추가합니다.
    }

    @GetMapping("/user") // GET /user
    public List<UserResponse> getUsers(){
        // Get users(유저 목록 조회)

        List<UserResponse> responses = new ArrayList<>(); // UserResponse 객체를 저장할 수 있는 리스트를 생성합니다.
        for(int i=0; i<users.size(); i++){ // users 리스트의 크기만큼 반복합니다.
            responses.add(new UserResponse(i+1, users.get(i))); // UserResponse 객체를 생성하여 responses 리스트에 추가합니다.
        }

        return responses;
    }

}
