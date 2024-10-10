package com.my.pentaho.sample.dto;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class SlackRequestDto {
    private String channel;
    private String text;
    private String userName;
    private String icon_emoji;
}
