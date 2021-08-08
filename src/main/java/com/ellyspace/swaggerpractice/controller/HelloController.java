package com.ellyspace.swaggerpractice.controller;

import com.ellyspace.swaggerpractice.service.HelloRequest;
import com.ellyspace.swaggerpractice.service.HelloService;
import org.springframework.web.bind.annotation.*;

@RestController("/v1/hello")
public class HelloController {

    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping
    public String helloGet() {
        return "hello";
    }

    @PostMapping("/new")
    public Long helloPost(@RequestBody HelloRequest request) {
        return helloService.post(request);
    }

    @DeleteMapping("/{id}")
    public void helloDelete(@PathVariable Long id) {
        helloService.delete(id);
    }
}
