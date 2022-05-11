package com.mamul.api.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class NoticeDto {

    @Getter
    @Setter
    @ToString
    public static class Request {

        private String name; // 제품명
        private String brand; // 브랜드
        private Integer price; // 가격
        private boolean isUsed; // 중고 여부
        private String details; // 제품 스펙
        private String usedDesc; // 사용감 상세
        private boolean inPerson; // 직거래 여부
        private boolean canPost; // 택배거래 여부

        public Notice toEntity(){
            return new Notice(null, name, brand, price, isUsed, details, usedDesc, inPerson, canPost);
        }
    }

}
