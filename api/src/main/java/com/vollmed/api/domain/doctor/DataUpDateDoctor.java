package com.vollmed.api.domain.doctor;

import com.vollmed.api.domain.address.DataAddress;
import jakarta.validation.constraints.NotNull;

public record DataUpDateDoctor(
        @NotNull Long id,
        String name,
        String document,
        String email,
        DataAddress address
) {
}
