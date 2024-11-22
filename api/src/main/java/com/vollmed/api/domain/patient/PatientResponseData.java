package com.vollmed.api.domain.patient;

import com.vollmed.api.domain.address.DataAddress;

public record PatientResponseData(
        Long id,
        String name,
        String email,
        String phone,
        String document,
        DataAddress address
) {
}
