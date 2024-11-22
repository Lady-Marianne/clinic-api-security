package com.vollmed.api.domain.patient;

import com.vollmed.api.domain.address.DataAddress;
import jakarta.validation.constraints.NotNull;

public record DataUpdatePatient(
        @NotNull
        Long id,
        String name,
        String phone,
        DataAddress address
) {
}




