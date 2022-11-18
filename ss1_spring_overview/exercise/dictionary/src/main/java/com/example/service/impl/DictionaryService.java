package com.example.service.impl;

import com.example.service.IDictionayService;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class DictionaryService implements IDictionayService {

    @Override
    public Map<String, String> translate() {

        Map<String, String> map = new LinkedHashMap<>();
        map.put("hello", "xin chào");
        map.put("banana", "chuối");
        map.put("apple", "táo");
        return map;
    }
}
