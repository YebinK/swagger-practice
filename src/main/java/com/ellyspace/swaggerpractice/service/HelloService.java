package com.ellyspace.swaggerpractice.service;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public Long post(HelloRequest request) {
        System.out.println("Add " + request.getName());

        return request.getId();
    }

    public void delete(Long id) {
        System.out.println("Remove " + id);
    }
}
