package com.mamul.api.service;

import com.mamul.api.model.Notice;
import com.mamul.api.model.NoticeDto;
import com.mamul.api.repository.NoticeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class NoticeService {

    private final NoticeRepository noticeRepository;

    private static final String NOTICE_FORMAT = "제품명: %s \n브랜드: %s \n가격: %d 원 \n중고 여부: %s " +
            "\n제품 스펙: %s \n사용감 상세 설명: %s \n직거래 여부: %s \n택배거래 여부: %s" +
            "\n문의 사항 있으시면 언제든 당근챗 주세요!\uD83D\uDE00";

    public String getFormattedNotice(NoticeDto.Request request) {
        // DTO -> Entity
        Notice notice = request.toEntity();

        // Entity -> DB 저장
        Notice saved = noticeRepository.save(notice);

        String isUsed = "중고 상품";
        if(!request.isUsed())    isUsed = "새상품";

        String inPerson = "가능합니다";
        if(!request.isInPerson()) inPerson = "불가능합니다";

        String canPost = "가능합니다";
        if(!request.isCanPost())    canPost = "불가능합니다";

        return String.format(
            NOTICE_FORMAT,
            request.getName(),
            request.getBrand(),
            request.getPrice(),
                        isUsed,
            request.getDetails(),
            request.getUsedDesc(),
                      inPerson,
                       canPost);
    }
}
