package com.ellyspace.swaggerpractice.controller;

import com.ellyspace.swaggerpractice.service.HelloRequest;
import com.ellyspace.swaggerpractice.service.HelloService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/hello/")
public class HelloController {

    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping
    @ApiOperation(value = "GET Sample", tags = "sample")
    public String helloGet() {
        return "hello";
    }

    @PostMapping("/new")
    @ApiOperation(value = "POST Sample", tags = "sample")
    public Long helloPost(@RequestBody HelloRequest request) {
        return helloService.post(request);
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "DELETE Sample", tags = "sample")
    public void helloDelete(@PathVariable Long id) {
        helloService.delete(id);
    }
}
