package com.etiyacrm.customerservice.services.dtos.responses.cityresponses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UpdatedCityResponse {
    private long id;
    private String name;
}
