package com.mamul.api.controller;

import com.mamul.api.model.NoticeDto;
import com.mamul.api.service.NoticeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/notice")
public class NoticeController {

    private final NoticeService noticeService;

    @PostMapping
    public String getFormattedNotice(@RequestBody NoticeDto.Request request) {
        log.info(request.toString());
        return noticeService.getFormattedNotice(request);
    }
}
