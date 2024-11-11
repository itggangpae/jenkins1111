package com.example.jenkin1111;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class JenkinsController {
    private final JenkinsService jenkinsService;


    @RequestMapping("/")
    public String index(@RequestParam("data") int data) {
        return String.valueOf(jenkinsService.hap(data));
    }
}