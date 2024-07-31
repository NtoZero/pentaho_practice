package com.my.pentaho.sample.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SampleResponseDto {
    String name;
    String addr;
}
