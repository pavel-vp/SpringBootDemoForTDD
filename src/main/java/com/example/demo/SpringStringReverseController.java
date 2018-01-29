package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by pasha on 12.12.17.
 */
@Controller
@RequestMapping("/")
public class SpringStringReverseController {

    @Autowired
    SpringStringReverseService service;

    @RequestMapping(value = "getreversed")
    public @ResponseBody String reverseString(@RequestParam("original") String original) {
        return service.reverseString(original);
    }

}
