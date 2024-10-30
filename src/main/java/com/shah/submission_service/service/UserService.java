package com.shah.submission_service.service;

import com.shah.submission_service.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "USER-SERVICE", url = "http://localhost:5001/")
public interface UserService {
    @GetMapping("/profile")
    public UserDto getUserProfile(@RequestHeader("Authorization") String jwt);
}