package com.divijjdk11.conference.controller;

import com.divijjdk11.conference.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser(@RequestParam(value ="firstname",defaultValue = "DJ") String firstname,
                        @RequestParam(value ="lastname",defaultValue = "N") String lastname,
                        @RequestParam(value ="age",defaultValue = "24") int age){

        User user = new User();

        user.setFirstname(firstname);
        user.setLastname(lastname);
        user.setAge(age);

        return user;

    }

    @PostMapping("/user")
    public  User postUser(User user){
        System.out.println("inside post Mr."+user.getFirstname()+" "+user.getLastname()+" aged "+user.getAge());
        return user;
    }

}
