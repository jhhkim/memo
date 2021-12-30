package com.aiproject.memo.dto;

import lombok.Getter;

import lombok.Getter;

@Getter
public class MemoRequestDto {
    private String username;
    private String contents;
    public Object toEntity() {
        return null;
    }
}
