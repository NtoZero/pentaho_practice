package com.my.pentaho.sample.controller;

import com.my.pentaho.sample.dto.SampleRequestDto;
import com.my.pentaho.sample.dto.SampleResponseDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/pentaho")
@RestController
public class SampleController {

    @GetMapping("/hello")
    public ResponseEntity<SampleResponseDto> hello(@RequestParam(value = "test", defaultValue = "default", required = false) String name) {
        return ResponseEntity.ok(SampleResponseDto.builder()
                .name(name)
                .build());
    }

    @PostMapping("/hello")
    public ResponseEntity<SampleResponseDto> hello(@RequestBody SampleRequestDto request) {
        return ResponseEntity.ok(SampleResponseDto.builder()
                .name(request.getName())
                .addr(request.getAddr())
                .build());
    }
}
