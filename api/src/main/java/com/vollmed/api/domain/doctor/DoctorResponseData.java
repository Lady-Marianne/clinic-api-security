package com.vollmed.api.domain.doctor;

import com.vollmed.api.domain.address.DataAddress;

public record DoctorResponseData(
        Long id,
        String name,
        String email,
        String phone,
        String document,
        DataAddress address
) {
}
