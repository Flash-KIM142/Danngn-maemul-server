package com.mamul.api.service;

import com.mamul.api.model.NoticeDto;
import org.springframework.stereotype.Service;

@Service
public class NoticeService {

    private static final String NOTICE_FORMAT = "%s %s 판매합니다~. \n %s \n문의사항 있으시면 언제든 연락주세요 😀";

    public String getFormattedNotice(NoticeDto.Request request) {
        return String.format(
            NOTICE_FORMAT,
            request.getBrand(),
            request.getName(),
            request.getDescription());
    }
}
