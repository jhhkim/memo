package com.aiproject.memo.service;

import com.aiproject.memo.domain.Memo;
import com.aiproject.memo.dto.MemoRequestDto;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class MemoService {
    private final Memo memo;

    //데이터 넣음
    @Transactional
    public Long save(MemoRequestDto requestDto){
        return memo.save(requestDto.toEntity()).getUsername();
        return memo.save(requestDto.toEntity()).getContents();
    }
    
}
