package com.springApp.springApp.resource;

import com.springApp.springApp.models.userdata;
import com.springApp.springApp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/userdata")
public class UserResource {
    @Autowired
    UserRepository userRepository;
    @GetMapping(value = "/all")
    public List<userdata> getAll()
    {
        return userRepository.findAll();
    }
    @PostMapping(value = "/load")
    public List<userdata> upload(@RequestBody final userdata users){
        userRepository.save(users);
        return userRepository.findAll();
    }
}
