package com.mamul.api.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

public class NoticeDto {

    @Getter
    @Setter
    @ToString
    public static class Request {

        private String name;
        private String description;
        private String size;
        private String brand;
        private boolean used;
    }

    @Getter
    @AllArgsConstructor
    public static class Response {

        private String content;
    }
}
