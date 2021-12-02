package com.example.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AController {

    @GetMapping(value = "/api/test/{fileId:^(?!%25).*}")
    public ResponseEntity<String> shouldNotMatch(@PathVariable String fileId) {
        return ResponseEntity.badRequest().build();
    }

    @GetMapping(value = "/api/test/{ticketId:[0-9]+}%2F{filename}")
    public ResponseEntity<String> shouldMatch(@PathVariable String ticketId, @PathVariable String filename) {
        return ResponseEntity.ok().build();
    }
}
