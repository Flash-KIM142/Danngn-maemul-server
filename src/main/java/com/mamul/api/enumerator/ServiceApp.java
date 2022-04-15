package com.mamul.api.enumerator;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ServiceApp {
    DANGGEUN("ROLE_GUEST"),
    BUNGAE_JANGTEO("ROLE_USER");

    private final String name;
}
