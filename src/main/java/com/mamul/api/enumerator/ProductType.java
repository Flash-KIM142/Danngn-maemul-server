package com.mamul.api.enumerator;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ProductType {
    CLOTHES("clothes"),
    DEVICE("device");

    private final String name;
}