package com.example.demo;

import org.springframework.stereotype.Service;

/**
 * Created by pasha on 12.12.17.
 */
@Service
public class SpringStringReverseService {

    public String reverseString(String original) {
        if (original == null)
            return null;
        StringBuilder sb = new StringBuilder();
        for (int i = original.length() - 1; i >= 0; --i) {
            sb.append(original.charAt(i));
        }
        return sb.toString();
    }

}
