package com.etiyacrm.customerservice.services.dtos.responses.districtResponses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreatedDistrictResponse {
    private long id;
    private String name;
    private long cityId;
}
