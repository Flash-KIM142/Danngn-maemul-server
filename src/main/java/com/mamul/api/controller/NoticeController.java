package com.mamul.api.controller;

import com.mamul.api.model.Notice;
import com.mamul.api.model.NoticeDto;
import com.mamul.api.repository.NoticeRepository;
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
    private final NoticeRepository noticeRepository;



    @PostMapping
    public String getFormattedNotice(@RequestBody NoticeDto.Request request) {
        log.info(request.toString());

//        // 1. DTO 를 Entity 로 변환
//        Notice notice = request.toEntity();
//        log.info(notice.toString());
//
//        // 2. Entity 를 DB에 저장
//        Notice saved = noticeRepository.save(notice);
//        log.info(saved.toString());

        return noticeService.getFormattedNotice(request);
    }
}
