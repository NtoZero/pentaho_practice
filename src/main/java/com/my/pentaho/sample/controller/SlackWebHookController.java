package com.my.pentaho.sample.controller;

import com.my.pentaho.sample.dto.SlackRequestDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/pentaho")
@RestController
public class SlackWebHookController {
    @PostMapping("/slack")
    public ResponseEntity<String> slack(@RequestBody String payload) {
        log.info("slack payload: {}", payload);

        return ResponseEntity.ok("slack payload: " + payload);
    }

    @PostMapping("/slack2")
    public ResponseEntity<String> slack2(@RequestBody SlackRequestDto payload) {
        log.info("slack payload: {}", payload);

        return ResponseEntity.ok("slack payload: " + payload);
    }
}
